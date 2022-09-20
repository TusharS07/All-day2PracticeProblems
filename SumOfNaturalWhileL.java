package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;
/*Write a Program for the sum of n natural numbers
 eg. Input N=5 output 1+2+3+4+5
 */
public class SumOfNaturalWhileL {
    public static void main(String[] args) {
        int n;
        int i = 0;
        int sum = 0;
        System.out.println("enter the natural number:- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while ( i <= n ) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum of natural numbers is :- " +sum);
    }
}
