package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArayList {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        int[] reverse=new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++]=array[i];
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("----------------------");

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> reversed = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));

        }

        System.out.println(reversed);


    }
}
