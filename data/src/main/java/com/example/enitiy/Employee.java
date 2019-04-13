package com.example.enitiy;

import java.util.Date;

/**
 * Employee Data model responsible for holding data retrieved from a data source.
 */

public class Employee {
    private String firstName;
    private String lastName;
    private String role;
    private Date dob;
    private int numberOfTaskCompleted;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String role, Date dob, int numberOfTaskCompleted) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.dob = dob;
        this.numberOfTaskCompleted = numberOfTaskCompleted;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getNumberOfTaskCompleted() {
        return numberOfTaskCompleted;
    }

    public void setNumberOfTaskCompleted(int numberOfTaskCompleted) {
        this.numberOfTaskCompleted = numberOfTaskCompleted;
    }
}
