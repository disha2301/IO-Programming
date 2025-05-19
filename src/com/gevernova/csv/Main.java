package com.gevernova.csv;

public class Main {
    public static void main(String[] args) {
        // File paths - adjust paths if needed
        String studentFile = "students.csv";
        String employeeFile = "employees.csv";
        String updatedEmployeeFile = "employees_updated.csv";

        // Call methods from CSVPractice
        CSVPractice.readAndPrintCSV(studentFile);
        CSVPractice.writeEmployeesCSV(employeeFile);
        CSVPractice.countRows(employeeFile);
        CSVPractice.filterStudentsByMarks(studentFile);
        CSVPractice.searchEmployee(employeeFile, "Alice Williams");
        CSVPractice.increaseITSalary(employeeFile, updatedEmployeeFile);
        CSVPractice.top5Salaries(updatedEmployeeFile);
    }
}
