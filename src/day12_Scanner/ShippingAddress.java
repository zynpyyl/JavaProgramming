package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name= scan.nextLine();
        System.out.println("Please enter your building number: ");
        String buildingNumber= scan.next();
        scan.nextLine();
        System.out.println("Please enter your street name: ");
        String streetName=scan.nextLine();
        System.out.println("Please enter your city name: ");
        String cityName=scan.nextLine();
        System.out.println("Please enter your state name: ");
        String stateName=scan.next();
        System.out.println("Please enter your zipcode: ");
        String zipCode=scan.next();
        scan.nextLine();
        System.out.println("Please enter your country: ");
        String country= scan.nextLine();
        scan.close();
        System.out.println(name+" \n"+buildingNumber+" "+streetName+" \n"+cityName+" "+stateName+" "+zipCode+' '+country);





    }
}
