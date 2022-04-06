package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer integer : list) {
            if(Collections.frequency(list,integer)==1)
                unique.add(integer);
        }

        System.out.println(unique);

        System.out.println("-------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        list.removeIf( p -> Collections.frequency(list,p)!=1 );

        System.out.println(list);


    }
}
