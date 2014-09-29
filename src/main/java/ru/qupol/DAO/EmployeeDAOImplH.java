package ru.qupol.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.qupol.entity.Employee;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Pavel on 24.09.2014.
 */
@Repository
public class EmployeeDAOImplH implements EmployeeDAO {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public EmployeeDAOImplH() {
    }

    @Override
    public Employee findEmployee(Long id) {

        return (Employee) getSession().get(Employee.class, id);
    }

    @Override
    public void addEmployee(Employee employee) {
        getSession().save(employee);
    }

    @Override
    public void editEmployee(Employee employee) {
        if (null != employee)
            getSession().merge(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {

        if (null != employee) {
            getSession().delete(employee);
        }
    }


    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> getListEmployee() {
        return getSession().createQuery("from Employee").list();
    }


    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> getListEmployeeLIKE(String param, String start) {
        Query query = getSession().createQuery("SELECT employee  FROM  Employee  employee WHERE :par LIKE :lk");
        query.setParameter("lk", start + "%");
        query.setParameter("par", param);
        return query.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> getListEmployeeLIKE(String start) {
        StringBuilder builder = new StringBuilder();
        builder.append("FROM  Employee ");
        builder.append(" WHERE");
        builder.append(" (first_name LIKE :lk )");
        builder.append(" or (second_name LIKE :lk )");
        builder.append(" or (last_name LIKE :lk )");
        builder.append(" or (description LIKE :lk )");
        Query query = getSession().createQuery(builder.toString());
        String toSearch = start + "%";
        query.setParameter("lk", toSearch);
        return query.list();
    }


}
