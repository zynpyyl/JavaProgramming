package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str="Java";
        char[] chars=str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for( char each: chars){
            System.out.println(each);
        }

        System.out.println("--------------------");

        String sentence="I love Java programming";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("--------------------");

        String email="WoodenSpoon@cydeo.com";
        String[] arr=email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[1]);
        String[] arr1=arr[1].split(".");
        System.out.println(Arrays.toString(arr1));





    }
}

