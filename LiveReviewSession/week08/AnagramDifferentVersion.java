package week08;

import java.util.Arrays;

public class AnagramDifferentVersion {
    public static void main(String[] args) {

        String word="silent";
        String word1="listen";
        int[] arr=new int[26];
        System.out.println(Arrays.toString(arr));

        for (char c : word.toCharArray()) {
            arr[c-97]=arr[c-97]+1;
        }
        System.out.println(Arrays.toString(arr));

        for (char c : word1.toCharArray()) {
            arr[c-97]=arr[c-97]-1;
        }
        System.out.println(Arrays.toString(arr));

        int[] emptyArray=new int[26];
        System.out.println(Arrays.toString(emptyArray));

        System.out.println("Are the words anagram: "+Arrays.equals(arr,emptyArray));

        



    }




}
