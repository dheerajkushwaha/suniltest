package com.dheeraj.recyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dheeraj kushwaha on 02/12/2018.
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Employee> employeeList = new ArrayList<>();
    private EmployeeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        prepareEmployeeData();
        mAdapter = new EmployeeAdapter(employeeList);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        // click listener
        recyclerView.addOnItemTouchListener(new RecyclerRowTouchListener(getApplicationContext(), recyclerView, new RecyclerRowTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Employee employee = employeeList.get(position);
                Toast.makeText(getApplicationContext(), employee.getName() + " is selected!", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onLongClick(View view, int position) {

            }
        }));


    }

    /**
     * Prepares sample data to provide data set to adapter
     */
    private void prepareEmployeeData() {
        Employee employee = new Employee("Dheeraj kushwaha", "Project lead", 10000);
        employeeList.add(employee);

        employee = new Employee("Mohsin khan", "Senior software Engineer", 1000);
        employeeList.add(employee);

        employee = new Employee("Kanayaiya gupta", "Associate Engineer III", 6000);
        employeeList.add(employee);

        employee = new Employee("Sanjay sharma", "Consultant", 9000);
        employeeList.add(employee);

        employee = new Employee("Narendra yadav", "Leam lead", 1000);
        employeeList.add(employee);

        employee = new Employee("Vishnu varma", "Articture", 10000);
        employeeList.add(employee);

        employee = new Employee("Vinay singh", "Associate Eng", 80000);
        employeeList.add(employee);

        employee = new Employee("Deepak kushwaha", "Associate Engineer", 60000);
        employeeList.add(employee);

        employee = new Employee("Dharmendra malya", "Sr. Associate Engineer", 9000);
        employeeList.add(employee);

        employee = new Employee("Nikita singh", "Team lead", 50000);
        employeeList.add(employee);
    }

}
