package com.subhani;

import java.util.Arrays;

public class employees {
    public static void main(String[] args) {
        //String
        String [] name = new String[5];
        int [] id = new int[5];
        float [] salary = new float[5];
        String [] employee = new String[5];
        Employee[] employees = new Employee[5];
        Employee employee1 = new Employee("Patan Mahaboob Subhani", 023, 10000f);
        Employee employee2 = new Employee("Shaik Khaja Muneer", 016, 20000f);
        Employee employee3 = new Employee("Shaik Baji", 015, 30000f);
        Employee employee4 = new Employee("Shaik Hussain Basha", 026, 40000f);
        System.out.println("Employee name: " + employee1.name + ", Employee ID: " + employee1.id + ", Employee Salary: " + employee1.salary + "0/-");
        System.out.println("Employee name: " + employee2.name + ", Employee ID: " + employee2.id + ", Employee Salary: " + employee2.salary + "0/-");
        System.out.println("Employee name: " + employee3.name + ", Employee ID: " + employee3.id + ", Employee Salary: " + employee3.salary + "0/-");
        System.out.println("Employee name: " + employee4.name + ", Employee ID: " + employee4.id + ", Employee Salary: " + employee4.salary + "0/-");
    }
}
class Employee{
    String name;
    int id;
    float salary;
    Employee(String Name, int iD, float Salary){
        name = Name;
        id = iD;
        salary = Salary;
    }
}