package day28_ArrayList;

public class PasswordValidation {

    public static void main(String[] args) {

    String password="Samsun59.";

        int upperCase=0, lowerCase=0, digit=0, specialChar=0;

        for ( char each : password.toCharArray() ){
            if(Character.isUpperCase(each)) {
                upperCase++;
            }else if(Character.isLowerCase(each)){
                lowerCase++;
            }else if(Character.isDigit(each)){
                digit++;
            }else{
                specialChar++;
            }
        }

    if(password.length()>=8 && !password.contains(" ") && upperCase>=1 && lowerCase>=1 && digit>=1 && specialChar>=1){

        System.out.println(password+" is a strong password");

    }else{

        System.out.println(password+" is not a strong password");

    }






}
}









//PasswordValidation:
//    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
//                1. Password MUST be at least have 8 characters long, and should not contain space
//                2. PassWord should at least contain one upper case letter
//                3. PassWord should at least contain one lower case letter
//                4. Password should at least contain one special characters
//                5. Password should at least contain a digit