package week09;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={-24,67,5,67,89,96,67,67,67};
        // we should sort array before using binarySearch method
        int index=Arrays.binarySearch(nums,67);  //returns index of 23
        System.out.println("index = " + index);

        System.out.println(Arrays.binarySearch(nums,89));
        System.out.println(Arrays.binarySearch(nums,67));
        System.out.println(Arrays.binarySearch(nums,67));
        System.out.println(Arrays.binarySearch(nums,-24));
        System.out.println(Arrays.binarySearch(nums,96));
        System.out.println(Arrays.binarySearch(nums,5));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("---------------------");
        System.out.println(Arrays.binarySearch(nums,89));
        System.out.println(Arrays.binarySearch(nums,67));
        System.out.println(Arrays.binarySearch(nums,67));
        System.out.println(Arrays.binarySearch(nums,-24));
        System.out.println(Arrays.binarySearch(nums,96));
        System.out.println(Arrays.binarySearch(nums,5));

    }


}
