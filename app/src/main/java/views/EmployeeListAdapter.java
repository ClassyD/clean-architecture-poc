package views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.amazing.taa.R;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class EmployeeListAdapter extends BaseAdapter {


    private List<Employee> employeeList;
    private Context context;

    static class ViewHolder {
        TextView employeeName;
        TextView employeeRole;
    }

    EmployeeListAdapter(@NonNull Context context) {
        this.context = context;
        this.employeeList = new ArrayList<>();
    }


    @Override
    public int getCount() {
        return employeeList.size();
    }

    @Override
    public Employee getItem(int position) {
        return employeeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = layoutInflater.inflate(R.layout.employee_item_view, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.employeeName = (TextView) rowView.findViewById(R.id.main_text);
            viewHolder.employeeRole = (TextView) rowView.findViewById(R.id.sub_text);
            rowView.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) rowView.getTag();
        Employee employee =  this.getItem(position);

        if (employee != null) {
            holder.employeeName.setText(employee.getFirstName());
            holder.employeeRole.setText(employee.getRole());
        }

        return rowView;

    }


    public void setData(List<Employee> listOfEmployees) {
        this.employeeList = listOfEmployees;
        this.notifyDataSetChanged();
    }

}
