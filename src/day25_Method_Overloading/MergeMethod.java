package day25_Method_Overloading;

import java.util.Arrays;

public class    MergeMethod {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1={5,6,7,8};

        System.out.println(Arrays.toString(merge(arr,arr1)));

    }

    public static int[]  merge(int[] arr1,int[]arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int i=0;
        for (int each : arr1) {
            arr[i++]=each;
        }
        for (int each : arr2) {
            arr[i++]=each;
        }
        return arr;

    }
    public static double[]  merge(double[] arr1,double[]arr2){
        double[] arr=new double[arr1.length+arr2.length];
        int i=0;
        for (double each : arr1) {
            arr[i++]=each;
        }
        for (double each : arr2) {
            arr[i++]=each;
        }
        return arr;

    }
    public static char[]  merge(char[] arr1,char[]arr2){
        char[] arr=new char[arr1.length+arr2.length];
        int i=0;
        for (char each : arr1) {
            arr[i++]=each;
        }
        for (char each : arr2) {
            arr[i++]=each;
        }
        return arr;

    }
    public static String[]  merge(String[] arr1,String[]arr2){
        String[] arr=new String[arr1.length+arr2.length];
        int i=0;
        for (String each : arr1) {
            arr[i++]=each;
        }
        for (String each : arr2) {
            arr[i++]=each;
        }
        return arr;

    }
}
