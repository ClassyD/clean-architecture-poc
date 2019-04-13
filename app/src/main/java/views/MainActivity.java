package views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.amazing.taa.R;
import com.example.usecases.EmployeeListUseCase;

import java.util.List;

import adapters.EmployeeAdapter;
import entities.Employee;
import presenters.UserListViewPresenter;

public class MainActivity extends AppCompatActivity implements IEmployeeListView {
    private EmployeeListAdapter adapter;
    private UserListViewPresenter userListViewPresenter = new UserListViewPresenter(this, new EmployeeListUseCase(), new EmployeeAdapter());
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ListView mainListView = (ListView) findViewById(R.id.employee_list);
        adapter = new EmployeeListAdapter(this);
        mainListView.setAdapter(adapter);

        userListViewPresenter.initialise();
        loadUserList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar ifm it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showLoading() {
        //TODO handle show loading spinner
    }

    @Override
    public void hideLoading() {
        //TODO handle hide loading spinner
    }

    @Override
    public void showError() {
        //TODO handle show Error
    }

    @Override
    public void renderEmployeeList(List<Employee> employeeList) {
        if (employeeList != null) {
            adapter.setData(employeeList);
        }
    }

    /**
     * Loads all users.
     */
    private void loadUserList() {
        userListViewPresenter.loadData();
    }
}
