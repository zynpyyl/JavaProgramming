package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String name=scan.next();
        System.out.println("Enter your last name:");
        String lastname= scan.next();
        scan.close();
        char f=name.charAt(0);
        char l=lastname.charAt(0);
        String initials=f+"."+l;
        System.out.println("initials = " + initials);






    }
}
