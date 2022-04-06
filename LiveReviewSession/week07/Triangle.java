package week07;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int numOfRows=new Scanner(System.in).nextInt();

        for (int row = 1; row <=numOfRows ; row++) {
            int value=row;
            for (int col = 1; col <=row; col++) {
                System.out.print(value);
                value+=numOfRows-col;
            }
            System.out.println();
        }
    }
}
/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */