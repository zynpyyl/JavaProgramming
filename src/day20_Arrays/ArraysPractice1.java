package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        int[] num={10,20,50,70};

        System.out.println(Arrays.toString(num));

        System.out.println("------------------");

        int[] scores=new int[5];

        scores[1]=85;
        scores[scores.length-1]=95;
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));

        System.out.println("---------------------");

        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};

        for (int i = 0; i < months.length ; i++) {
            System.out.println(months[i]);
        }
        System.out.println("----------------------");
        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);

        }


    }
}
