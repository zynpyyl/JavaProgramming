package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {
        int[] arr={7,8,9};
        int index=1;
        System.out.println(Arrays.toString(removeElement(arr,index)));

    }

    public static int[] removeElement(int[] arr,int index){

        if(index<0||index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        int[] result= {};
        for (int i=0;i<arr.length ;i++) {
            if (i!=index) {
                result= ArraysUtility.addElement(result,arr[i]);
            }
        }
        return result;
    }

}
