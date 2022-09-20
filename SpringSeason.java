package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        //declare two variable month and day
        int m; //month
        int d; //day
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number:- ");
        m = sc.nextInt();
        System.out.println("Enter Day:- ");
        d = sc.nextInt();

        //create boolean variable for true false condition
        // in that vaeiable save the condition of march 20 to june 20 is true
        boolean isSpringSeason = (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20);
        System.out.println(isSpringSeason);
    }
}
