package day25_Method_Overloading;

import java.util.Arrays;


public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        double[] arr1={1.2,2.3,3.4,4.5};
        char[] arr2={'a','b','c'};
        String[] arr3={"aaa","bbb","ccc"};

        arr=addElement(arr,5);
        arr1=addElement(arr1,2.5);
        arr2=addElement(arr2,'g');
        arr3=addElement(arr3,"ddd");


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }




    public static int[] addElement(int[] arr,int i){
        int[] arr1= Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    public static double[] addElement(double[] arr,double i){
        double[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    public static String[] addElement(String[] arr,String i){
        String[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    public static char[] addElement(char[] arr,char i){
        char[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }

}
