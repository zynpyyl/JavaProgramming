package day14_Strings;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word=new Scanner(System.in).next();
        if(word.charAt(0)=='x'){
            System.out.println(word.replaceFirst("x","a"));
        }



    }



}
