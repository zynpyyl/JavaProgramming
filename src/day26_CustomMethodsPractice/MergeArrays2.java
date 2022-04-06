package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={3,4,5};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));


    }

    public static int[] mergeArrays(int[]arr1,int[]arr2){
        int[] result={};
        for (int each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
}
