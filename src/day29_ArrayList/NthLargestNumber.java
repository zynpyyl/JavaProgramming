package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5,6,6,7,8,9,9,10));
        
        int n=3;
        for(int i=1;i<n;i++) {
            int max=Collections.max(list);
            list.removeAll(Arrays.asList(max));
        }
        int max=Collections.max(list);

        System.out.println(n+"th largest number: "+max);







    }
}
