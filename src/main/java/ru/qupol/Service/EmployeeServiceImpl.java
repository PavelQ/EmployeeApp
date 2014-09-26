package ru.qupol.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.qupol.DAO.EmployeeDAO;
import ru.qupol.entity.Employee;

import java.util.List;

/**
 * Created by Pavel on 23.09.2014.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {


   @Autowired EmployeeDAO employeeDAO;


    @Transactional
    @Override
    public Employee findEmployee(Long id) {
        return employeeDAO.findEmployee(id);
    }

    @Transactional
    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Transactional
    @Override
    public void editEmployee(Employee employee) {
         employeeDAO.editEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteEmployee(Long id) {
       employeeDAO.deleteEmployee(employeeDAO.findEmployee(id));
    }

    @Transactional
    @Override
    public List<Employee> getListEmployee() {
        return employeeDAO.getListEmployee();
    }

    @Override
    public List<Employee> getListFirstNameStarts(String word) {
        return employeeDAO.getListEmployeeLIKE("firstName",word);
    }


}
