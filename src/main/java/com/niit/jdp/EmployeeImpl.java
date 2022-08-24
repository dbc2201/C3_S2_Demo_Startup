/*
 * Author Name: Divyansh Bhardwaj
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee daniel = new Employee("Daniel", 130, 32, "12/12/1990", "124 Bridgewater Eville", 3000.0);
        double annualSalary = daniel.calculateAnnualSalary();
        System.out.println("annualSalary = $" + annualSalary);
    }
}
