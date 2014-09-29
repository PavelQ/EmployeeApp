package ru.qupol.tools;

import ru.qupol.entity.Employee;

import java.util.List;

/**
 * Created by Pavel on 28.09.2014.
 */
public class HTMLGenerator {
    public static String listToTDRows(List<Employee> list) {
        if (list == null) return null;
        StringBuilder sb = new StringBuilder();
        for (Employee employee : list) {
            sb.append("<tr>");
            sb.append("<td class=\"employee-id\">").append(employee.getId()).append("</td>");
            sb.append("<td class=\"employee-FName\">").append(employee.getFirstName()).append("</td>");
            sb.append("<td class=\"employee-SName\">").append(employee.getSecondName()).append("</td>");
            sb.append("<td class=\"employee-LName\">").append(employee.getLastName()).append("</td>");
            sb.append("<td class=\"employee-age\">").append(employee.getAge()).append("</td>");
            sb.append("<td class=\"employee-experience\">").append(employee.getExperience()).append("</td>");
            sb.append("<td class=\"employee-description\">").append(employee.getDescription()).append("</td>");
//            sb.append("<td><a href=EditEmployee/").append(employee.getId()).append(">edit</a></td>");
            sb.append("<td class=\"employee-delete\"><a href=delete/").append(employee.getId()).append(">delete</a></td>");
            sb.append("</tr>");
        }

        return sb.toString();

    }
}
