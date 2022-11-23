package com.bridgelabz.computation;

public class EmployeeWage {
    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=10;
    static final int PART_TIME_HOUR=5;
    public static void main(String[] args) {
        int attendance;
        int dailyWage=0;
        int day=1;
        int totalWage=0;

        System.out.println("Welcome to Employee Wage Computation");

        while (day <=20) {
            System.out.println("Day #"+day);
            attendance = checkAttendance();

            switch (attendance) {
                case IS_FULL_TIME:
                    System.out.println("Employee is full time");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWage+=dailyWage;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is part time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWage+=dailyWage;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }

            System.out.println("Daily Wage = " + dailyWage);
            day++;
        }
        System.out.println("Total Wage of month= "+totalWage);
    }
    static int checkAttendance(){
        int random=(int)(Math.random()*10)%3;
        return random;
    }
}
//    public static void main(String args[]) {
//        System.out.println("Welcome to Employee Wge Program");
//        int dailyWage = 0;
//        int empRandom = (int) Math.floor(Math.random() * 10) % 3;
//
//        System.out.println(empRandom);
//        if (empRandom == IS_FULL_TIME && FULL_DAY_HOUR == 16) {
//            System.out.println("Employee is present Full time");
//            EMPLOYEE_PRESENT = 20;
//            //int dailyWage = 0;
//            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
//        } else if (empRandom == IS_PART_TIME && PART_TIME_HOUR == 8) {
//            System.out.println("Employee is present Part time");
//            EMPLOYEE_PRESENT = 20;
//            //int dailyWage = 0;
//            dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
//        } else {
//            System.out.println("Employee is absent");
//        }
//        System.out.println("Daily Wage is " + dailyWage);
//      //  System.out.println("UC3 done");
//
//    }
//}


//        public static void main(String args[]) {
//            System.out.println("Welcome to Employee Wge Program");
//            int dailyWage = 0;
//            int employeePresent = (int) Math.floor(Math.random() * 10) % 2;
//            System.out.println(employeePresent);
//            if (employeePresent == 1) {
//                System.out.println("Employee is present");
//                EMPLOYEE_PRESENT = 20;
//                //int dailyWage = 0;
//                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
//            } else{
//                System.out.println("Employee is absent");
//            }
//            System.out.println("Daily Wage is "+dailyWage);
//            System.out.println("UC2 done");

//            public static void main(String args[]){
//                System.out.println("Welcome to Employee Wge Program");
//                int employeePresent = (int) Math.floor(Math.random() * 10) % 2;
//                System.out.println(employeePresent);
//                if (employeePresent == 1)
//                    System.out.println("Employee is present");
//                else
//                    System.out.println("Employee is absent");
//                System.out.println("UC1 done");
//
//
//            }
//        }