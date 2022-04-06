package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String s="I love Java";
        String[] arr=s.split(" ");
        String reverse="";
        for (int i =arr[1].length()-1; i >=0 ; i--) {
            reverse+=""+arr[1].charAt(i);
        }

    //    s=s.replaceFirst(arr[1],reverse);

        arr[1]=reverse;
        String s1="";
        for (String each : arr) {
            s1+=each+" ";
        }

        System.out.println(s1);




    }
}
