package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
        String answer= scan.next();

        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid answer, please re-enter");
            answer= scan.next();
        }

        System.out.println((answer.equalsIgnoreCase("yes")? "Congrats!" : "Goodbye" ));


    }
}





//Task:
//	1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
//    if the answer is yes, print "Congrats."
//    if the answer is no, print "Goodbye"
//    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it
//    until the user enters either yes or no