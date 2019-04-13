package com.example.usecases;

import com.example.entities.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
   void  getAllEmployees(ICallback<List<Employee>> callback);
}
