package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String word=new Scanner(System.in).nextLine();
        String output="";
        for (int i = 0; i < word.length() ; i++) {
            String s1 = word.charAt(i)+"";
            if (!output.contains(s1))
            output += s1;
        }
        System.out.println(output);
    }
}
//	2. Write a program that can remove the duplicated characters from a String
//			Ex:
//				input:
//					AABBCCBC
//				Output:
//					ABC
//			Hint: You can add each characters of the string into another String
//				  Condition: the character is not contained in the other String yet before you are adding