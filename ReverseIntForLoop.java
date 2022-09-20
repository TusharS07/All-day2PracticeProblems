package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;

public class ReverseIntForLoop {
    public static void main(String[] args) {
        int num;
        int reversed = 0;

        System.out.println("enter number:- ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
