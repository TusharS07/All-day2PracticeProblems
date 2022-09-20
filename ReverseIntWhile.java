package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;

public class ReverseIntWhile {
    public static void main(String[] args) {
        int n;
        int reversed = 0;
        //taking number from user
        System.out.println("Enter number:- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //while for reverse integers
        while ( n != 0 ) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }

        System.out.println("The Reverse of Give integer number is " + reversed);
    }
}

