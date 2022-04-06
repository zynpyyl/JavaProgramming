package day25_Method_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

    String str="Java Programming Language";

    StringUtility.printEachChar(str);

    System.out.println("---------------------");

    String reverse=StringUtility.reverse(str);

    System.out.println((str));

    System.out.println("---------------------");

    String word="madam";

    boolean palindrome=StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        String[] names={"Anna","Java","Python","racecar","Mom","Cydeo"};

        int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each))
                count++;
        }

        System.out.println(count+" words are palindrome");

        System.out.println("---------------------");

        String s="aaabbbccc";

        s= StringUtility.removeDuplicates(s);

        System.out.println("s = " + s);








}



}
