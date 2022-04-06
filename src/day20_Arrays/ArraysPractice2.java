package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letters=new char[26];
        for (char j = 0, ch='A'; j <26 ; j++,ch++) {
            letters[j]=ch;
            }

        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------");

        char[] letters2=new char[26];
        char ch='Z';
        for (int i = 0; i <26 ; i++,ch--) {
            letters2[i]=ch;
        }
        System.out.println(Arrays.toString(letters2));




    }
}
