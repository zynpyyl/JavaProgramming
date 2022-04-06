package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each char of the given string
    public static void printEachChar(String str){

        for(int i=0;i<str.length();i++){

            System.out.println(str.charAt(i));

        }





    }

    //reverse the given string and returns the reversed string
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    //checks if the given string is palindrome or not, returns boolean
    public static boolean isPalindrome(String str){

        return reverse(str).equalsIgnoreCase(str);

    }

    //checks if the given string is anagram or not, returns boolean
    public static boolean isAnagram(String word1,String word2){

        char[] ch1=word1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2=word2.toCharArray();
        Arrays.sort(ch1);

        return Arrays.equals(ch1,ch2);

    }

    //removes the duplicates from given string, returns String
    public static String removeDuplicates(String str){
        String removed="";
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            if(!removed.contains(each+""))
                removed+=each;
        }
        return removed;
    }



}
