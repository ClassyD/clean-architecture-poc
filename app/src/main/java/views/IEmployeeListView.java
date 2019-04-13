package views;

import android.app.ListActivity;

import java.util.List;

import entities.Employee;

public interface IEmployeeListView extends IView {

    void renderEmployeeList(List<Employee> employeeList);
}
