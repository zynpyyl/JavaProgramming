package day10_NestedIf;

import org.w3c.dom.ls.LSOutput;

public class TernariesIntro {
    public static void main(String[] args) {
        int num = 25;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("---------------------");

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        System.out.println("---------------------");

        int age = 19;
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        System.out.println("---------------------");
        String result2=(age >= 21)? "Eligible": "Not Eligible";
        System.out.println(result2);
        System.out.println("---------------------");

        int num1=0;
            if (num1>0){
                System.out.println("Positive");
            }else if(num1<0){
                System.out.println("Negative");
            }else{
            System.out.println("Zero");
        }
        System.out.println("---------------------");
        String result3=(num1>0)? "Positive" :(num1>0)? "Negative" : "Zero";
        System.out.println(result3);







    }

    }
