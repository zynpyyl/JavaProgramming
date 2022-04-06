package week05;

import java.util.Scanner;

public class ReplacePractice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String str=in.next();
        int num=0;

        switch(str){
            case "one" :
                num=1;
                break;
            case "two":
                num=2;
                break;
            case "three":
                num=3;
                break;
        }
        System.out.println(num);



    }
}
