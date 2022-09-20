package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;

public class PalindromeNumberForLoop {
    public static void main(String[] args) {
        int num, palind, i, rem;

        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        palind = num;
        for (i = 0; num > 0; num /= 10) {
            rem = num % 10;
            i = (i * 10) + rem;
        }
        if (i == palind)
            System.out.println(palind + " is a palindrome number ");
        else
            System.out.println(palind + " is not a palindrome number ");

    }
}
