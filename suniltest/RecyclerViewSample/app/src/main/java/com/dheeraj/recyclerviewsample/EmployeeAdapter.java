package com.dheeraj.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dheeraj kushwaha on 02/12/2018.
 */
public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.MyViewHolder> {

    private List<Employee> employeeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, designation, salary;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            designation = (TextView) view.findViewById(R.id.designation);
            salary = (TextView) view.findViewById(R.id.salary);
        }
    }

    public EmployeeAdapter(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.employee_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Employee employee = employeeList.get(position);
        holder.name.setText(employee.getName());
        holder.designation.setText(employee.getDesignation());
        holder.salary.setText(""+employee.getSalary());
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }
}
