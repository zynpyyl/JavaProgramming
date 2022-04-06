package day26_CustomMethodsPractice;

import utilities.MathUtility;

public class Test_MathUtility {
    public static void main(String[] args) {


    int num1=5;
    int num2=8;
    double num3=5.5;
    double num4=6.5;

        System.out.println(MathUtility.sum(num1,num2));
        System.out.println(MathUtility.subtraction(num1,num2));
        System.out.println(MathUtility.multiplication(num1,num2));
        System.out.println(MathUtility.sum(num3,num4));
        System.out.println(MathUtility.subtraction(num3,num4));
        System.out.println(MathUtility.multiplication(num3,num4));
        System.out.println(MathUtility.division(num3,num4));

        System.out.println(MathUtility.isEven(num1));
        System.out.println(MathUtility.isOdd(num1));

        System.out.println(MathUtility.max(num1,num2));
        System.out.println(MathUtility.max(num3,num4));
        System.out.println(MathUtility.min(num1,num2));
        System.out.println(MathUtility.min(num3,num4));

        System.out.println(MathUtility.square(num1));
        System.out.println(MathUtility.square(num3));

        System.out.println(MathUtility.cube(num1));
        System.out.println(MathUtility.cube(num3));










}
}