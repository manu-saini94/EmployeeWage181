package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage");
        int empPresent = (int) Math.floor(Math.random() * 10) % 2;    // 0.01  , 0.356  , 0.563
        if (empPresent == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
