package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] myGroup=new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";
        System.out.println(Arrays.toString(myGroup));
        System.out.println("----------------------");
        int[] mylist={1,2,3,4,5};
        System.out.println(Arrays.toString(mylist));

        System.out.println("----------------------");

        String[]days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

        int number=5;
        if(number<1||number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("----------------------");

        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.println(months[3]);




    }
}
