package com.gevernova.streams.objectserialization;
import java.io.Serializable;
public class Employee implements Serializable{
    private int id;
    private String name;
    private String dept;
    private double salary;

    // constructor
    public Employee(int id, String name, String dept, double salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;

    }

    // display method
    public void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Department: " + dept +
                ", Salary: $" + salary);
    }
}
