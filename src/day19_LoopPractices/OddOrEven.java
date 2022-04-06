package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
            System.out.println("Do you want to continue?");
            String cont = scan.next();

            if (!(cont.equalsIgnoreCase("yes"))) {
                System.exit(0);
            }
        }





}
}
