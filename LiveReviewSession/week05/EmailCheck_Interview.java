package week05;

import java.util.Scanner;

public class EmailCheck_Interview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an email:");
        String email=scan.next();
        int indexOf1=email.indexOf("@");
        int indexOf2=email.indexOf(".");
        int indexOf3=email.indexOf(".co");
        if(email.contains("@")&&email.contains(".")&&indexOf1>0&&email.contains(".co")&&indexOf3>indexOf1){
            System.out.println("valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
/*
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */
