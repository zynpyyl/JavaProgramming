package day25_Method_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr={2, 4, 6, 8};
        arr=addInteger(arr,5);
        System.out.println(Arrays.toString(arr));



    }


    public static int[] addInteger(int[] arr,int i){
        int[] arr1= Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    public static double[] addDouble(double[] arr,double i){
        double[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    public static String[] addInteger(String[] arr,String i){
        String[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    public static char[] addInteger(char[] arr,char i){
        char[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }







}
