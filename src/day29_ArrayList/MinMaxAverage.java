package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxAverage {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(3,8,6,45,1,56,78,54,32));
        int max=list.get(0);
        int min=list.get(0);
        int sum=0;
        for (Integer integer : list) {
            if(integer>max)
                max=integer;
            if(integer<min)
                min=integer;
            sum+=integer;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average= "+ (double) sum/ list.size());

    }
}
