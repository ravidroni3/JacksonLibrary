package org.example;

public class Employee {
    private int empID;
    private String empName;
    private String empEmail;
    private String role;

    public Employee() {
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public String getRole() {
        return role;
    }

    public Employee(int empID, String empName, String empEmail, String role) {
        this.empID = empID;
        this.empName = empName;
        this.empEmail = empEmail;
        this.role = role;

    }
}
