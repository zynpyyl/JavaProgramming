package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius= scan.nextDouble();
        scan.close();
        double area=3.14*radius*radius;
        double perimeter=2*3.14*radius;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);






    }
}
// 1. Circle:
//            1.1 Ask the user to enter the radius of the circle
//            1.1 Calculate the area and perimeter of the circle by using the radius