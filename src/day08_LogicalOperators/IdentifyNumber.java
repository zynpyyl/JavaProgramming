package day08_LogicalOperators;

public class IdentifyNumber {
    public static void main(String[] args) {
        /*1. Create a class called IdentifyNumber, and write a program that can identify if the
        given number is positive, or negative or zero.
        	Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
         */

		int number=-50;
        System.out.println(number+" is positive number: " + (number>0));
        System.out.println(number+" is negative number: " + (number<0));
        System.out.println(number+" is zero: " + (number==0));






    }






}
