package com.example.adapters;

import com.example.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements IAdapter<List<com.example.enitiy.Employee>, List<Employee>> {

    @Override
    public List<Employee> Adapt(List<com.example.enitiy.Employee> entity) {
        if (entity.size() == 0 || entity.isEmpty()) {
            return null;
        }

        List<Employee> domainEmployees = new ArrayList<>();
        Employee domainEmployee = new Employee();
        for (com.example.enitiy.Employee employee : entity) {
            domainEmployee.setFirstName(employee.getFirstName());
            domainEmployee.setLastName(employee.getLastName());
            domainEmployee.setRole(employee.getRole());
            domainEmployee.setNumberOfTaskCompleted(employee.getNumberOfTaskCompleted());
            domainEmployee.setDob(employee.getDob());

            domainEmployees.add(domainEmployee);

        }
        return domainEmployees;
    }
}
