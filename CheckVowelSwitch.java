package com.Bridgelabz.day2PracticeProblems;
import java.util.Scanner;

public class CheckVowelSwitch {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter the Alphabet :- ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        switch (ch) {

            case 'a':
                System.out.println(ch+ " is a vowel");
                break;

            case 'e':
                System.out.println(ch+ "is vowels");
                break;

            case 'i':
                System.out.println(ch+ "is vowels");
                break;

            case 'o':
                System.out.println(ch+ "is vowels");
                break;

            case 'u':
                System.out.println(ch+ "is vowels");
                break;

            case 'A':
                System.out.println(ch+ "is vowels");
                break;

            case 'E':
                System.out.println(ch+ "is vowels");
                break;

            case 'I':
                System.out.println(ch+ "is vowels");
                break;

            case 'O':
                System.out.println(ch+ "is vowels");
                break;

            case 'U':
                System.out.println(ch+ "is vowels");
                break;

            default:
                System.out.println(ch+ "is Consonant");
                break;
        }
    }
}
