package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.next();
        System.out.println("Enter a char:");
        char ch=scan.next().charAt(0);
        int num=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch)
                num++;
        }
        System.out.println("Frequency of char "+ch+" is "+num);



    }
}


//1. Write a program that can return the frequency of a char from a String
//			Ex:
//				str = "AAABBBC"
//				ch = 'A'
//			Output:
//				3