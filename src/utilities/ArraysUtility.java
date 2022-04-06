package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }
    //prints each double of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double i : array) {
            System.out.println(i);
        }
    }
    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array){
        for (char i : array) {
            System.out.println(i);
        }
    }
    //prints each string of a string array in separate lines
    public static void printEachElement(String[] array){
        for (String i : array) {
            System.out.println(i);
        }
    }

    //returns the max number from the given integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    //returns the max number from the given double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    //returns the min number from the given integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    //returns the min number from the given double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given int num is contained in the given array, returns boolean
    public static boolean contains(int[] arr,int num) {
        boolean result = false;
        for (int each : arr) {
            if (each == num) {
                result = true;
                break;
            }
        }
        return result;
    }
    //checks if the given double num is contained in the given array, returns boolean
    public static boolean contains(double[] arr,double num){
        boolean result=false;
        for (double each : arr) {
            if(each==num){
                result=true;
                break;
            }
        }
        return result;
    }
    //checks if the given char is contained in the given array, returns boolean
    public static boolean contains(char[] arr,char ch){
        boolean result=false;
        for (char each : arr) {
            if(each==ch){
                result=true;
                break;
            }
        }
        return result;
    }
    //checks if the given String is contained in the given array, returns boolean
    public static boolean contains(String[] arr,String str){
        boolean result=false;
        for (String each : arr) {
            if(each.equals(str)){
                result=true;
                break;
            }
        }
        return result;
    }
    //adds the given element to array, returns array

    public static int[] addElement(int[] arr,int i){
        int[] arr1= Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    //adds the given element to array, returns array
    public static double[] addElement(double[] arr,double i){
        double[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    //adds the given element to array, returns array
    public static String[] addElement(String[] arr,String i){
        String[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }
    //adds the given element to array, returns array
    public static char[] addElement(char[] arr,char i){
        char[] arr1=Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=i;
        return arr1;
    }

    //returns the frequency of the given element in the given array
    public static int frequencyOfElement(int[] arr,int num){
        int count=0;
        for (int each : arr) {
            if(each==num)
                count++;
        }
        return count;
    }
    //returns the frequency of the given element in the given array
    public static int frequencyOfElement(double[] arr,double num){
        int count=0;
        for (double each : arr) {
            if(each==num)
                count++;
        }
        return count;
    }
    //returns the frequency of the given element in the given array
    public static int frequencyOfElement(char[] arr,char ch){
        int count=0;
        for (char each : arr) {
            if(each==ch)
                count++;
        }
        return count;
    }
    //returns the frequency of the given element in the given array
    public static int frequencyOfElement(String[] arr,String str){
        int count=0;
        for (String each : arr) {
            if(each.equals(str))
                count++;
        }
        return count;
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

    //merge the given two arrays and returns new array
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
    //merge the given two arrays and returns new array
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
    //merge the given two arrays and returns new array
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
    //merge the given two arrays and returns new array
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

    //removes the duplicated elements and returns a new array
    public static int[] removeDuplicates(int[] arr){
        int[] result={};
        for (int each : arr) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    //removes the duplicated elements and returns a new array
    public static double[] removeDuplicates(double[] arr){
        double[] result={};
        for (double each : arr) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    //removes the duplicated elements and returns a new array
    public static char[] removeDuplicates(char[] arr){
        char[] result={};
        for (char each : arr) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    //removes the duplicated elements and returns a new array
    public static String[] removeDuplicates(String[] arr){
        String[] result={};
        for (String each : arr) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
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

    //inserts the given element to the given index of the given array, returns new array
    public static int[] insert(int[] arr,int index,int element){
        int[] arr1=new int[arr.length+1];
        arr1[index]=element;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if(i==index) {
                arr1[i] = element;
                j++;
            }
            arr1[j] = arr[i];
        }
        return arr1;
    }
    //inserts the given element to the given index of the given array, returns new array
    public static double[] insert(double[] arr,int index,double element){
        double[] arr1=new double[arr.length+1];
        arr1[index]=element;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if(i==index) {
                arr1[i] = element;
                j++;
            }
            arr1[j] = arr[i];
        }
        return arr1;
    }
    //inserts the given element to the given index of the given array, returns new array
    public static char[] insert(char[] arr,int index,char element){
        char[] arr1=new char[arr.length+1];
        arr1[index]=element;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if(i==index) {
                arr1[i] = element;
                j++;
            }
            arr1[j] = arr[i];
        }
        return arr1;
    }
    //inserts the given element to the given index of the given array, returns new array
    public static String[] insert(String[] arr,int index,String element){
        String[] arr1=new String[arr.length+1];
        arr1[index]=element;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if(i==index) {
                arr1[i] = element;
                j++;
            }
            arr1[j] = arr[i];
        }
        return arr1;
    }

    //swaps the two elements at the given indexes, returns a new array
    public static int[] swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
    //swaps the two elements at the given indexes, returns a new array
    public static double[] swap(double[] arr,int index1,int index2){
        double temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
    //swaps the two elements at the given indexes, returns a new array
    public static char[] swap(char[] arr,int index1,int index2){
        char temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
    //swaps the two elements at the given indexes, returns a new array
    public static String[] swap(String[] arr,int index1,int index2){
        String temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }

    

}
