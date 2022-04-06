package day18_NestedLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username:");
        String username=scan.next();
        System.out.println("Enter password:");
        String password= scan.next();
        if(username.equals("Cydeo")&&password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            for (int i = 0; i <3 ; i++) {
                System.out.println("Invalid entry.\nEnter username:");
                username=scan.next();
                System.out.println("Enter password:");
                password= scan.next();
                if(username.equals("Cydeo")&&password.equals("Cydeo123")){
                    System.out.println("Logged in");
                    break;
                }
            }
            }
        if(!(username.equals("Cydeo")&&password.equals("Cydeo123"))){
            System.out.println("Your account is locked.");
        }
        scan.close();
        }
}
