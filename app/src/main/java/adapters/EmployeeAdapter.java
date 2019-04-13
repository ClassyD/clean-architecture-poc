package adapters;

import com.example.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements IAdapter<List<Employee>, List<entities.Employee>> {

    @Override
    public List<entities.Employee> Adapt(List<Employee> entity) {

        if (entity.size() == 0 || entity.isEmpty()) {
            return null;
        }

        List<entities.Employee> viewEmployees = new ArrayList<>();
        entities.Employee viewEmployee = new entities.Employee();
        for (Employee employee : entity) {
            viewEmployee.setFirstName(employee.getFirstName());
            viewEmployee.setLastName(employee.getLastName());
            viewEmployee.setRole(employee.getRole());

            viewEmployees.add(viewEmployee);
        }
        return viewEmployees;
    }


}
