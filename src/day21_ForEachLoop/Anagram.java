package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String word="heart";
        String word2="earth";

        char[] each=word.toCharArray();
        char[] each1=word2.toCharArray();

        Arrays.sort(each);
        Arrays.sort(each1);

        if(Arrays.equals(each,each1))
            System.out.println(word+" and "+word2+" are anagrams");

}}
