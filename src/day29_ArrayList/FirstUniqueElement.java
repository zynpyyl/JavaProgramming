package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {

    ArrayList<Integer> list= new ArrayList<>();
    ArrayList<Integer> result=new ArrayList<>();
    list.addAll(Arrays.asList(1,2,3,3,4,1,2,5,6,7));
        for (Integer integer : list) {
            int count=0;
            for (Integer integer1 : list) {
                if(integer==integer1)
                    count++;
            }
            if(count==1){
                System.out.println(integer);
                break;
            }


        }







}
    }