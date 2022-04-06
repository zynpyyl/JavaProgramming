package week05;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a valid email:");
        String email=scan.next();
        String name=email.substring(0,email.indexOf("_"));
        String lastname=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        name=name.toUpperCase().charAt(0)+name.toLowerCase().substring(1);
        lastname=lastname.toUpperCase().charAt(0)+lastname.toLowerCase().substring(1);
        System.out.println("name = " + name);
        System.out.println("lastname = " + lastname);
        System.out.println("domain = " + domain);;




    }
}
