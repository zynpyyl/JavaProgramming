package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6};
        int[] arr3=new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = arr1.length,j=0; i < arr3.length; i++,j++) {
            arr3[i]=arr2[j];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------");

        int i=0;
        for (int each : arr1) {
            arr3[i]=each;
            i++;
        }
        for (int each : arr2) {
            arr3[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------");

        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','G','H'};
        char[] ch3=new char[ch1.length+ch2.length];

        int k=0;
        for (char each : ch1) {
            ch3[k]=each;
            k++;
        }
        for (char each : ch2) {
            ch3[k]=each;
            k++;
        }
        System.out.println(Arrays.toString(ch3));


    }
}
