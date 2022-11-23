package com.bridgelabz.computation;

public class EmployeeWage {

        static int EMPLOYEE_PRESENT = 1;
        static final int WAGE_PER_HOUR = 20;
        static final int FULL_DAY_HOUR = 16;

        public static void main(String args[]) {
            System.out.println("Welcome to Employee Wge Program");
            int dailyWage = 0;
            int employeePresent = (int) Math.floor(Math.random() * 10) % 2;
            System.out.println(employeePresent);
            if (employeePresent == 1) {
                System.out.println("Employee is present");
                EMPLOYEE_PRESENT = 20;
                //int dailyWage = 0;
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            } else {
                System.out.println("Employee is absent");
            }
            System.out.println("Daily Wage is " + dailyWage);
    }
}
