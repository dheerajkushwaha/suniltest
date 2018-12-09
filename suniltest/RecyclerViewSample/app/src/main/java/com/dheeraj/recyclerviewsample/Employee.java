package com.dheeraj.recyclerviewsample;

/**
 * Created by Dheeraj kushwaha on 02/12/2018.
 */
public class Employee {

    private String name, designation;
    private int salary;

   public Employee(String name1,String designation,int salary){

        this.name=name1;
        this.designation=designation;
        this.salary=salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
