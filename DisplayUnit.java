package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;
//Read a Number 1,10,100,1000 and display unit, ten hundred

public class DisplayUnit {
    public static void main(String[] args) {
        //take user input number
        int num;
        System.out.println("Enter Number:- ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if ( num == 1 ){
            System.out.println( num+ " is Unit");

        } else if ( num == 10 ) {
            System.out.println( num+ " is Ten ");

        } else if ( num == 100 ) {
            System.out.println( num+ " is Hundred");

        } else if ( num == 1000) {
            System.out.println( num+ " is Thousand");

        } else if ( num == 10000) {
            System.out.println( num+ " is Ten Thousand");

        } else if ( num == 100000) {
            System.out.println( num+ " is One Lakh");

        } else if ( num == 10000000) {
            System.out.println( num+ " is One Crore");

        }
        else {
            System.out.println("enter valid number Please");
        }
    }
}
