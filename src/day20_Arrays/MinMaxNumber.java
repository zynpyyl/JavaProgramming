package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length= scan.nextInt();
        if(length<=0) {
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int[] numbers=new int[length];

        for (int i = 0; i < length ; i++) {
            System.out.println("Enter a number: ");
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int max=numbers[0];
        int min=numbers[0];
        for (int i = 0; i <length ; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }

        System.out.println("Max number is:"+max);
        System.out.println("Min number is:"+min);
        scan.close();
    }
}
