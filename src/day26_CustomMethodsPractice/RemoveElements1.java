package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        String[] arr={"aaa","hjhgh","khkh"};
        int index=1;
        System.out.println(Arrays.toString(removeElement(arr,index)));

    }
    //removes the given index element from the given array, returns a new array
    public static int[] removeElement(int[] arr,int index){

        if(index<0||index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        int[] result=new int[arr.length-1];
        int j=0;
        for (int i=0;i<arr.length ;i++) {
            if (i==index) {
                continue;
            }
            result[j++]=arr[i];
        }
        return result;
    }
    //removes the given index element from the given array, returns a new array
    public static double[] removeElement(double[] arr,int index){
        if(index<0||index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        double[] result=new double[arr.length-1];
        int j=0;
        for (int i=0;i<arr.length ;i++) {
            if (i==index) {
                continue;
            }
            result[j++]=arr[i];
        }
        return result;
    }
    //removes the given index element from the given array, returns a new array
    public static char[] removeElement(char[] arr,int index){
        if(index<0||index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }

        char[] result=new char[arr.length-1];
        int j=0;
        for (int i=0;i<arr.length ;i++) {
            if (i==index) {
                continue;
            }
            result[j++]=arr[i];
        }
        return result;
    }
    //removes the given index element from the given array, returns a new array
    public static String[] removeElement(String[] arr,int index){
        if(index<0||index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        String[] result=new String[arr.length-1];
        int j=0;
        for (int i=0;i<arr.length ;i++) {
            if (i==index) {
                continue;
            }
            result[j++]=arr[i];
        }
        return result;
    }










}
