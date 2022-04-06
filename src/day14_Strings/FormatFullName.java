package day14_Strings;

import java.util.Locale;
import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your firstname:");
        String firstName= input.next();
        System.out.println("Enter your lastname:");
        String lastName=input.next();
        firstName=firstName.toUpperCase(Locale.ROOT).charAt(0)+firstName.substring(1).toLowerCase();
        lastName=lastName.toUpperCase(Locale.ROOT).charAt(0)+lastName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
    }
}
