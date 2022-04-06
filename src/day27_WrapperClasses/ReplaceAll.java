package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,10,1,3,1,3,1,3,7,9};
        arr= replaceAll(arr,3,33);
        System.out.println(Arrays.toString(arr));

        String[] arr1={"zeyno","disco","zeyno"};
        arr1=replaceAll(arr1,"zeyno","xxx");
        System.out.println(Arrays.toString(arr1));




    }
    //replace all the matching values with the new value
    public static int[] replaceAll(int[] arr,int oldValue,int newValue){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==oldValue)
                arr[i]=newValue;
        }
        return arr;
    }
    //replace all the matching values with the new value
    public static double[] replaceAll(double[] arr,double oldValue,double newValue){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==oldValue)
                arr[i]=newValue;
        }
        return arr;
    }
    //replace all the matching values with the new value
    public static char[] replaceAll(char[] arr,char oldValue,char newValue){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==oldValue)
                arr[i]=newValue;
        }
        return arr;
    }
    //replace all the matching values with the new value
    public static String[] replaceAll(String[] arr,String oldValue,String newValue){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(oldValue))
                arr[i]=newValue;
        }
        return arr;
    }
}
