package com.bridgelabz.computation;

public class EmployeeWage {
    public static void main(String args[]){
            System.out.println("Welcome to Employee Wge Program");
            int employeePresent= (int)Math.floor(Math.random()*10)%2;
            System.out.println(employeePresent);
            if(employeePresent==1)
                System.out.println("Employee is present");
            else
                System.out.println("Employee is absent");
            System.out.println("UC1 done");
    }
}
