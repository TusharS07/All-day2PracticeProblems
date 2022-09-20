package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;

public class ArithmaticOperMAxMIn {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:- ");
        a = sc.nextInt();
        System.out.println("Enter Second Number:- ");
        b = sc.nextInt();
        System.out.println("Enter Thrid Number:- ");
        c = sc.nextInt();
        // making new variable for arthmatic opration

        int sum1 = a + b +c;
        int sum2 = c + a / b;
        int sum3 = a % b + c;
        int sum4 = a * b + c;

        //Print all opration result
        System.out.println("(a+b*c)= " +sum1);
        System.out.println("(c+a/b)= " +sum2);
        System.out.println("(a%b+c)= " +sum3);
        System.out.println("(a*b+c)= " +sum4);

        //campare all result and find min and max value
        if ((sum1 > sum2) && (sum1 > sum2) && (sum1 > sum4)) {
            System.out.println(sum1+ " is maximum");

        } else if ((sum2 > sum3) && (sum2 > sum4) && (sum2 > sum1)) {
            System.out.println(sum2+ " is maxmum");

        } else if ((sum3 > sum4) && (sum3 > sum1) && (sum3 > sum2)) {
            System.out.println(sum3+ " is maximum");

        } else{
            System.out.println(sum4+ " is maximum");

        }

        //campare all resuls for minimum
        if ((sum1 < sum2) && (sum1 < sum2) && (sum1 < sum4)) {
            System.out.println(sum1+ " is minimum");

        } else if ((sum2 < sum3) && (sum2 < sum4) && (sum2 < sum1)) {
            System.out.println(sum2+ " is minimum");

        } else if ((sum3 < sum4) && (sum3 < sum1) && (sum3 < sum2)) {
            System.out.println(sum3+ " is minimum");

        } else{
            System.out.println(sum4+ " is minimum");

        }




    }
}
