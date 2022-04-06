package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt();
        //age 1~120
        while(age<1||age>120){
            System.err.println("Invalid entery, please re-enter your age:");
            age= scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String isCitizen=scan.next();
        while(!(isCitizen.equalsIgnoreCase("yes")||isCitizen.equalsIgnoreCase("no"))){
            System.err.println("Invalid entery, please re-enter if you are a US citizen or not:");
            isCitizen=scan.next();
        }

if(age>=18&&isCitizen.equalsIgnoreCase("yes")){
    System.out.println("You are eligible to vote.");
}else{
    System.out.println("You are not eligible to vote.");
}



    }
}
