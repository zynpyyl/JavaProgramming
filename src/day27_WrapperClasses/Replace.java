package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        arr= replace(arr,2,10);
        System.out.println(Arrays.toString(arr));
        String[]arr1={"ghgh","hghjf"};
        arr1=replace(arr1,1,"Zeynep");
        System.out.println(Arrays.toString(arr1));
    }
    //replace the element of the array at given index with the new element
    public static int[] replace(int[] arr,int index,int newElement){
        if(index<0||index>arr.length) {
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        arr[index]=newElement;
        return arr;
        }
    //replace the element of the array at given index with the new element
    public static double[] replace(double[] arr,int index,double newElement){
        if(index<0||index>arr.length) {
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        arr[index]=newElement;
        return arr;
    }
    //replace the element of the array at given index with the new element
    public static char[] replace(char[] arr,int index,char newElement){
        if(index<0||index>arr.length) {
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        arr[index]=newElement;
        return arr;
    }
    //replace the element of the array at given index with the new element
    public static String[] replace(String[] arr,int index,String newElement){
        if(index<0||index>arr.length) {
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        arr[index]=newElement;
        return arr;
    }
}
