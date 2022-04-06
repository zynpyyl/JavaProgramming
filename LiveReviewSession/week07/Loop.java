package week07;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows= scan.nextInt();
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <=i ; j++) {
                if(j%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }

    }
}

/*
            1
            1 0
            1 0 1
            1 0 1 0
            1 0 1 0 1
            1 0 1 0 1 0

 */