package ru.qupol.DAO;

import ru.qupol.entity.Employee;

import java.util.List;

/**
 * Created by Pavel on 22.09.2014.
 */
public interface EmployeeDAO {
    public Employee findEmployee(Long id);

    public void addEmployee(Employee employee);

    public void editEmployee(Employee employee);

    public void deleteEmployee(Employee employee);

    public List<Employee> getListEmployee();

    public List<Employee> getListEmployeeLIKE(String param, String start);

    public List<Employee> getListEmployeeLIKE(String start);

}
