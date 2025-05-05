package com.gevernova.streams.objectserialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeManager {
    public static void main(String[] args){
        String filename = "employee.ser";

        // creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"Disha","SDE",4152121));
        employees.add(new Employee(102,"Disha","SDE",4152121));
        employees.add(new Employee(103,"Disha","SDE",4152121));
        employees.add(new Employee(104,"Disha","SDE",4152121));

        // serialize the list
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(employees);
            System.out.println("Employees list serialized to "+filename);
        }catch (IOException e){
            System.out.println("Serialization error: " + e.getMessage());
        }
        // deserialize the list
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            List<Employee> retrievedList = (List<Employee>) ois.readObject();
            System.out.println("\nDeserialized Employee List:");
            for(Employee emp: retrievedList){
                emp.display();
            }
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
