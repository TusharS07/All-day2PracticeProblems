package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;

public class MonthNameDisplaySwitch {
    public static void main(String[] args) {
        int monthNumber;
        System.out.print("Enter month's number: ");
        Scanner sc = new Scanner(System.in);
        monthNumber = sc.nextInt();


        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber+ " is January");
                break;

            case 2:
                System.out.println(monthNumber+ " is February");
                break;

            case 3:
                System.out.println(monthNumber+ " is March");
                break;

            case 4:
                System.out.println(monthNumber+ " is April");
                break;

            case 5:
                System.out.println(monthNumber+ " is May");
                break;

            case 6:
                System.out.println(monthNumber+ " is June");
                break;

            case 7:
                System.out.println(monthNumber+ " is July");
                break;

            case 8:
                System.out.println(monthNumber+ " is August");
                break;

            case 9:
                System.out.println(monthNumber+ " is September");
                break;

            case 10:
                System.out.println(monthNumber+ " is October");
                break;

            case 11:
                System.out.println(monthNumber+ "November");
                break;

            case 12:
                System.out.println(monthNumber+ "December");
                break;

            default:
                System.out.println("enter valid Month Number");
                break;
        }
    }
}
