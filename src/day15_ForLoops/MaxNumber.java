package day15_ForLoops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int maxNumber=-2147483648;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int num= scan.nextInt();
            if(num>maxNumber){
                maxNumber=num;
            }

        }
        System.out.println("Maximum number is : "+maxNumber);




    }
}
