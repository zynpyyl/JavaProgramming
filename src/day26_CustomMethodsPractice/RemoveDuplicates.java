package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,6,6};
        System.out.println(Arrays.toString(removeDuplicates(arr)));

    }
    //removes the duplicated elements and returns a new array
    public static int[] removeDuplicates(int[] arr){
        int[] result={};
        for (int each : arr) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
         return result;
        }
    //removes the duplicated elements and returns a new array
    public static double[] removeDuplicates(double[] arr){
        double[] result={};
        for (double each : arr) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    //removes the duplicated elements and returns a new array
    public static char[] removeDuplicates(char[] arr){
        char[] result={};
        for (char each : arr) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    //removes the duplicated elements and returns a new array
    public static String[] removeDuplicates(String[] arr){
        String[] result={};
        for (String each : arr) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


}
