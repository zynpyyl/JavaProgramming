package day15_ForLoops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word= scan.next();
        String reverse="";

        for (int i = word.length()-1; i >=0; i--) {

            reverse+=word.charAt(i);
        }
        System.out.println(reverse);
    }
}
//1. Write a program that can reverse any given string
//
//			String str = "Java"; ==> avaJ
//		 //			      0123