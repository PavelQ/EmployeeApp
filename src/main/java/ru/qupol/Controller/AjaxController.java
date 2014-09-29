package ru.qupol.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ru.qupol.Service.EmployeeService;
import ru.qupol.entity.Employee;
import ru.qupol.tools.HTMLGenerator;

import java.util.List;

/**
 * Created by Pavel on 28.09.2014.
 */
@Controller
public class AjaxController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/ajax")
    public ModelAndView searchAjaxGET() {
        return new ModelAndView("searchAjax");
    }



    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    @ResponseBody
    public String searchAjaxPost2 (@RequestParam(value = "word", required = false) String word) {
        List<Employee> employeeList = employeeService.getListStarts(word);
        return HTMLGenerator.listToTDRows(employeeList);
    }


    @RequestMapping(value = "/ajaxEdit",method = RequestMethod.POST)
    @ResponseBody
    public String editAjaxPOST(@RequestParam Long id,@RequestParam String fname,
                               @RequestParam String sname,@RequestParam String lname,
                               @RequestParam byte age,@RequestParam int exp,
                               @RequestParam String descr) {
        System.out.println("here : "+fname+age);
        //Employee employee = new Employee();

        return "ok";
    }


}
