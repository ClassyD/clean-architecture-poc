package presenters;

import com.example.repositories.EmployeeRepository;
import com.example.usecaseinterface.IEmployeeUseCase;
import com.example.usecases.EmployeeListUseCase;
import com.example.usecases.IPresenterCallBack;

import java.util.List;

import javax.annotation.Nonnull;

import adapters.EmployeeAdapter;
import views.IEmployeeListView;

public class UserListViewPresenter implements IPresenter, IPresenterCallBack<List<com.example.entities.Employee>> {
    private IEmployeeListView view;
    private EmployeeListUseCase employeeUseCase;
    private EmployeeAdapter adapter;

    public UserListViewPresenter(@Nonnull IEmployeeListView view, IEmployeeUseCase employeeUseCase, EmployeeAdapter adapter) {
        this.view = view;
        this.employeeUseCase = (EmployeeListUseCase) employeeUseCase;
        this.adapter = adapter;
    }

    @Override
    public void initialise() {
        employeeUseCase.setPresenterCallback(this);
        employeeUseCase.setRepository(new EmployeeRepository());
    }

    @Override
    public void loadData() {
        getAllEmployees();
    }

    @Override
    public void resume() {
        //TODO handle view resume
    }

    @Override
    public void pause() {
        //TODO handle view pause
    }

    @Override
    public void destroy() {
        //TODO handle view destroy
    }

    /**
     * Private
     */

    private void getAllEmployees() {
        employeeUseCase.getAllEmployees();
    }


    /**
     * Presenter callBack
     */

    @Override
    public void onSuccess(List<com.example.entities.Employee> valueToReturn) {
        List<entities.Employee> employeeList = adapter.Adapt(valueToReturn);
        view.renderEmployeeList(employeeList);
    }

    @Override
    public void onError(Throwable throwable) {
        //TODO handle error
    }


}
