package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String word=new Scanner(System.in).next();
        String s1="";
        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);
            if(word.indexOf(ch)==word.lastIndexOf(ch))
                s1+=ch;
        }
        System.out.println(s1);
    }
}
//3. Write a program that can return the unique characters from a String
//	            Ex:
//				input:
//					AABCCD
//				output:
//					BD