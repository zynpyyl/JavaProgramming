package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
        
    }
    
    
    //reverse the given array, returns a new array
    public static int[] reverseArray(int[] arr){
        int[] result=new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }
    //reverse the given array, returns a new array
    public static double[] reverseArray(double[] arr){
        double[] result=new double[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }
    //reverse the given array, returns a new array
    public static char[] reverseArray(char[] arr){
        char[] result=new char[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }
    //reverse the given array, returns a new array
    public static String[] reverseArray(String[] arr){
        String[] result=new String[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }
}
