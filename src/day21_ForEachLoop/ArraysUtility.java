package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("-------------------");

        String s1="heart";
        String s2="earth";
        char[] array= new char[5];
        char[] array2=new char[5];

        for (int i = 0; i < array.length; i++) {
            array[i]=s1.charAt(i);
            array2[i]=s2.charAt(i);
        }
        Arrays.sort(array);
        Arrays.sort(array2);

        if(Arrays.equals(array,array2)){
            System.out.println(s1+" and "+s2+" are anagram");
        }




    }
}
