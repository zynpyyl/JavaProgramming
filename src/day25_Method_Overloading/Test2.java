package day25_Method_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

    int[] arr1={1,2,3,4,5};

    ArraysUtility.printEachElement(arr1);

        System.out.println("------------------");

    double[] arr2={1.5,2.5,3.5};
    ArraysUtility.printEachElement(arr2);

        System.out.println("------------------");

        char[] arr3={'A','B','C'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------");

        String[] arr4={"Java","Phyton","C++"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("------------------");

        int[] n1={1,2,3,4,5,6};
        int max1=ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println("------------------");

        double[] n2={1.5,3.5,4.3,5.4};
        double max2=ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("------------------");

        int[] arr={1,2,3,4};
        int num=5;
        boolean contains=ArraysUtility.contains(arr,num);
        System.out.println(contains);

        System.out.println("------------------");

        double[] array={1.5,2.5,3.5,4.5};
        double numm =5.5;
        boolean containss=ArraysUtility.contains(array, numm);
        System.out.println(containss);

        System.out.println("------------------");

        char[] arry={'a','b','c'};
        char ch ='e';
        System.out.println(ArraysUtility.contains(arry, ch));

        System.out.println("------------------");

        String[] s={"aa","bb","ccc"};
        String s1 ="aa";
        System.out.println(ArraysUtility.contains(s,s1));










}

}
