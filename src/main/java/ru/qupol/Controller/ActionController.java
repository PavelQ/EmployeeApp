package ru.qupol.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.qupol.Service.EmployeeService;
import ru.qupol.entity.Employee;

import java.util.List;

/**
 * Created by Pavel on 23.09.2014.
 */


@Controller
public class ActionController {



    @Autowired
    EmployeeService employeeService;

    /**
     * redirects from home page to view
     * and used by other redirection
     *
     * @return redirect to home page
     */
    @RequestMapping("/")
    public String home() {
        return "redirect:/view";

    }

    /**
     * main page it shows all employees
     */
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView showAllEmployees() {
        ModelAndView modelAndView = new ModelAndView("Employees");
        List employeesList = employeeService.getListEmployee();
        modelAndView.addObject("allEmployees", employeesList);
        return modelAndView;
    }

    /**
     * Send to page for Create new Employee
     *
     * @return
     */
    @RequestMapping(value = "/CreateEmployee", method = RequestMethod.GET)
    public ModelAndView createEmployee() {
        ModelAndView modelAndView = new ModelAndView("addEdit");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("navigate", "CreateEmployee");
        return modelAndView;
    }

    /**
     * Submit creating of Employee
     *
     * @param employee entered employee
     * @param result   helps to shows binding errors
     * @return redirect to /view page
     */
    @RequestMapping(value = "/CreateEmployee", method = RequestMethod.POST)
    public String submitAddEmployee(@ModelAttribute("employee") Employee employee,
                                    BindingResult result) {
        employeeService.addEmployee(employee);
        return home();
    }


    /**
     * Shows all attributes on edit page
     * user can change all of this
     *
     * @param employeeId id of employee for change
     * @return model with edited employee
     */
    @RequestMapping(value = "/EditEmployee/{employeeId}", method = RequestMethod.GET)
    public ModelAndView editEmployee(@PathVariable("employeeId") Long employeeId) {
        ModelAndView modelAndView = new ModelAndView("addEdit");
        modelAndView.addObject("navigate", "../EditEmployee");
        Employee employee = employeeService.findEmployee(employeeId);
        modelAndView.addObject("employee", employee);
        System.out.println(employee);
        modelAndView.addObject("employeeId", employeeId);
        return modelAndView;
    }

    /**
     * Submit changed employee and redirect to view page
     *
     * @param employee edited employee
     * @return nothing to show, redirect to view page
     */
    @RequestMapping(value = "/EditEmployee", method = RequestMethod.POST)
    public String SubmitEditEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.editEmployee(employee);
        return home();
    }


    /**
     * delete employee by ID
     *
     * @param employeeId unique id of Employee
     * @return redirect to home page
     */
    @RequestMapping("/delete/{employeeId}")
    public String deleteEmployee(@PathVariable("employeeId") Long employeeId) {

        employeeService.deleteEmployee(employeeId);

        return home();
    }

    @RequestMapping("/search")
    public ModelAndView search() {
        return new ModelAndView("search");
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView searchPost(@RequestParam(value = "word", required = false) String word) {
        ModelAndView mav = new ModelAndView("search");
        List emplList = employeeService.getListStarts(word);
        mav.addObject("employees", emplList);
        return mav;
    }


}

