package day15_ForLoops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int minNumber=2147483647;
        for (int i = 0; i <5 ; i++) {
            System.out.print("Enter a number:");
            int num=scan.nextInt();
            if(num<minNumber){
                minNumber=num;
            }
        }
        scan.close();
        System.out.println("minNumber = " + minNumber);





    }
}
