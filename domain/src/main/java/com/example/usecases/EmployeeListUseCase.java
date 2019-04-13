package com.example.usecases;

import com.example.entities.Employee;
import com.example.usecaseinterface.IEmployeeUseCase;

import java.util.List;

public class EmployeeListUseCase implements IEmployeeUseCase {
    private IEmployeeRepository repository;
    private IPresenterCallBack<List<Employee>> presenterCallback;
    private ICallback<List<Employee>> callback = new ICallback<List<Employee>>() {
        @Override
        public void onSuccess(List<Employee> valueToReturn) {
            presenterCallback.onSuccess(valueToReturn);
        }

        @Override
        public void onError(Throwable throwable) {
            presenterCallback.onError(throwable);
        }
    };

    @Override
    public void getAllEmployees() {
        repository.getAllEmployees(callback);
    }

    @Override
    public void setRepository(IRepository repository) {
        this.repository = (IEmployeeRepository) repository;
    }

    @Override
    public void setPresenterCallback(IPresenterCallBack callback) {
        presenterCallback = callback;
    }
}
