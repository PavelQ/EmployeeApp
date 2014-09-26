package ru.qupol.Service;

import ru.qupol.entity.Employee;

import java.util.List;

/**
 * Created by Pavel on 23.09.2014.
 */
public interface EmployeeService {
    /**
     * finds the Employee by id
     * @param id of Employee
     * @return found Employee
     */
    public Employee findEmployee(Long id);

    public void addEmployee(Employee employee);
    public void editEmployee(Employee employee);
    public void deleteEmployee(Long id);
    public List<Employee> getListEmployee();
    public List<Employee> getListFirstNameStarts(String word);
}
