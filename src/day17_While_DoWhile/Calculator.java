package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1=scan.nextInt();
        System.out.println("Enter your second number:");
        int num2=scan.nextInt();
        System.out.println("Enter a math operator:");
        char ch=scan.next().charAt(0);
        //+ - valid operators
        while(ch!='+'&&ch!='-'){
            System.err.println("Invalid operator. Please re-enter:");
            ch=scan.next().charAt(0);
        }
        if(ch=='+'){
            System.out.println(num1+num2);
        }else if(ch=='-'){
            System.out.println(num1-num2);
        }




    }
}
