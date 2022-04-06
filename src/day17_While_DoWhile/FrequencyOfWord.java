package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        System.out.println("Enter a sentence:");
        String sentence=new Scanner(System.in).nextLine();
        int num=0;
        for (int i = 0; i <sentence.length()-3 ; i++) {
            if(sentence.substring(i,i+4).equals("Java"))
                num++;
        }

        System.out.println("Frequency of the word Java is "+num);
    }
}
//2. write a program that can return the frequency of the word Java from the sentence
//        Ex:
//            sentence = "JavaJavaJava";
//            output: 3