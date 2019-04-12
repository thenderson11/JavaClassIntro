package com.company;

import java.util.Scanner;

public class DaysOfWeek {
    /*
        using the string class and the swit h statement
        i will create a Days Of The Week Converter
        from the Numbered Day To The actual Day Of The Week
     */
    public static void main(String[] args) {
        daysOfWeekConverter();
    }

    static void daysOfWeekConverter(){
        System.out.println("Enter only one number 1-7");
        System.out.println("Ill tell you the Week Day");
        // grabbing Input From User For Week Day Number
        int weekDay = new Scanner(System.in).nextInt();
        // utilizing switch statement to handle multiple outputs
        switch(weekDay){
            case 1:{
                String m = "Monday";
                System.out.println(m);
            }
            break;
            case 2:{
                String tu = "Tuesday";
                System.out.println(tu);
            }
            break;
            case 3:{
                String wed = "Wednesday";
                System.out.println(wed);
            }
            break;
            case 4: {
                String thu = "Thursday";
                System.out.println(thu);
            }
            break;
            case 5: {
                String fri = "Friday";
                System.out.println(fri);
            }
            break;
            case 6: {
                String sat = "Saturday";
                System.out.println(sat);
            }
            break;
            case 7: {
                String sun = "Sunday";
                System.out.println(sun);
            }

        }
}





}

