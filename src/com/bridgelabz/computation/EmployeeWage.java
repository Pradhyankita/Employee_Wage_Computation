package com.bridgelabz.computation;

public class EmployeeWage {

        public enum Attendance{
            IS_FULL_TIME,IS_PART_TIME
        }
        static final int FULL_DAY_HOUR=10;
        static final int PART_TIME_HOUR=5;
        static final int MAX_HOURS=100;
        static final int MAX_DAYS=20;
        static int wagePerHour;


        static final int IS_FULL_TIME = 2;
        static final int IS_PART_TIME = 1;
        static final int WAGE_PER_HOUR = 20;
        static final int FULL_DAY_HOUR = 10;
        static final int PART_TIME_HOUR = 5;
        static final int MAX_HOURS = 100;
        static final int MAX_DAYS = 20;


        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation");
            EmployeeWage.getEmployeeWage();
        }

        static void getEmployeeWage(){
            Attendance attendance;
            int dailyWage=0;
            int day=1;
            int totalWage=0;
            int totalWorkingHrs=0;

            while (day <=MAX_DAYS && totalWorkingHrs<MAX_HOURS) {
                attendance = checkAttendance();

                switch (attendance) {
                    case IS_FULL_TIME:
                        if (totalWorkingHrs+FULL_DAY_HOUR <= MAX_HOURS) {
                            dailyWage = wagePerHour * FULL_DAY_HOUR;
                            totalWorkingHrs+=FULL_DAY_HOUR;
                        }else {
                            dailyWage = wagePerHour * PART_TIME_HOUR;
                            totalWorkingHrs+=PART_TIME_HOUR;
                        }
                        break;
                    case IS_PART_TIME:
                        dailyWage = wagePerHour * PART_TIME_HOUR;
                        totalWorkingHrs+=PART_TIME_HOUR;
                        break;
                    default:
                        break;
                }
                totalWage+=dailyWage;
                System.out.println("day "+day+" wage= "+ dailyWage);
                day++;
            }
            System.out.println();
            System.out.println("Total Days = "+(day-1));
            System.out.println("Total Working Hours = "+totalWorkingHrs);
            System.out.println("Total Wage of month= "+totalWage);

        }
        static Attendance checkAttendance(){
            int random=(int)(Math.random()*10)%3;
            return (random==Attendance.IS_FULL_TIME.ordinal()) ? Attendance.IS_FULL_TIME: Attendance.IS_PART_TIME;
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
