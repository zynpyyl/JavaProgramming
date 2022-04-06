package day14_Strings;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word=new Scanner(System.in).next();
        String word1=word.replace('x','a').replace('X','a');
        System.out.println(word1);




    }
}
