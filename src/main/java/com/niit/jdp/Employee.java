/*
 * Author Name: Divyansh Bhardwaj
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class Employee {
    String name;
    int code;
    int age;
    String dateOfBirth;
    String address;
    double salary;

    public Employee() {
    }

    public Employee(String name, int code, int age, String dateOfBirth, String address, double salary) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.salary = salary;
    }

    /**
     * This method calculated the annual salary of an employee.
     *
     * @return the annual salary of an employee.
     */
    public double calculateAnnualSalary() {
        return this.salary * 12.0;
    }
}
