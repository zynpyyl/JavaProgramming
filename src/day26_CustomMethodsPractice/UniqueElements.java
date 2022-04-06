package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] array ={1,1,2,3,3,4,5,5,6,7,7,7,};
        int[] unique=uniqueElement(array);
        System.out.println(Arrays.toString(unique));
        System.out.println("---------------------");
        double[] array1 ={1.5,1.5,2.5,3.5,3.5,4.5,5.5,5.5,6.5,7.5,7.5,7.5,};
        double[] unique1=uniqueElement(array1);
        System.out.println(Arrays.toString(unique1));


    }
    //returns the unique elements of the given array as a new array
    public static int[] uniqueElement(int[] arr){

        int[] result={}; //new int[0]
        for (int each : arr) {
            if((ArraysUtility.frequencyOfElement(arr,each))==1)
                result=ArraysUtility.addElement(result,each);
        }
        return result;
        }
    //returns the unique elements of the given array as a new array
    public static double[] uniqueElement(double[] arr){

        double[] result={}; //new double[0]
        for (double each : arr) {
            if((ArraysUtility.frequencyOfElement(arr,each))==1)
                result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
    //returns the unique elements of the given array as a new array
    public static char[] uniqueElement(char[] arr){

        char[] result={}; //new char[0]
        for (char each : arr) {
            if((ArraysUtility.frequencyOfElement(arr,each))==1)
                result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
    //returns the unique elements of the given array as a new array
    public static String[] uniqueElement(String[] arr){

        String[] result={}; //new String[0]
        for (String each : arr) {
            if((ArraysUtility.frequencyOfElement(arr,each))==1)
                result=ArraysUtility.addElement(result,each);
        }
        return result;
    }








    }


