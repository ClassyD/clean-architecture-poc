package com.example.repositories;

import com.example.adapters.EmployeeAdapter;
import com.example.enitiy.Employee;
import com.example.usecases.ICallback;
import com.example.usecases.IEmployeeRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private EmployeeAdapter employeeAdapter = new EmployeeAdapter();

    @Override
    public void getAllEmployees(ICallback<List<com.example.entities.Employee>> callback) {
        List<Employee> dataReceived = getStubEmployeeData();
        callback.onSuccess(employeeAdapter.Adapt(dataReceived));
    }


    private List<Employee> getStubEmployeeData() {

        List<Employee> listOfEmployees = new ArrayList<>();
        Employee employeeOne = new Employee();
        employeeOne.setFirstName("David");
        employeeOne.setLastName("Olaniyi");
        employeeOne.setRole("G");
        employeeOne.setDob(new Date());

        Employee employeeTwo = new Employee();
        employeeTwo.setFirstName("christ");
        employeeTwo.setLastName("mas");
        employeeTwo.setRole("G");
        employeeTwo.setDob(new Date());

        Employee employeeThree = new Employee();
        employeeThree.setFirstName("Joe");
        employeeThree.setLastName("Blogs");
        employeeThree.setRole("G");
        employeeThree.setDob(new Date());

        listOfEmployees.add(employeeOne);
        listOfEmployees.add(employeeTwo);
        listOfEmployees.add(employeeThree);

        return listOfEmployees;
    }

}
