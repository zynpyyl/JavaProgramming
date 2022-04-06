package day18_NestedLoops;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the dividend number:");
        int num1=scan.nextInt();
        System.out.println("Enter the divisor number:");
        int num2=scan.nextInt();
        int quotient=0;
        while(num1>=num2){
            num1-=num2;
            quotient++;
        }
        System.out.println("quotient = " + quotient);
    }
}

//1. Write a program that can divide two positive numbers
// without using / (division) and * (multiplication) operators.