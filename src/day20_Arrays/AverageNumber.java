package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length=scan.nextInt();

        int[] numbers=new int[length];
        int total=0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i]= scan.nextInt();
            total+=numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Average is "+total/length);








    }
}
