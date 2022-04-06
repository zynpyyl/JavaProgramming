package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] names={"Cydeo School","Wooden Spoon","Java Programming","SQL Programming",
                "Selenium Automation","API Testing","Database Testing","Manual Testing"};
        String[] reverse=new String[names.length];
        int i = names.length-1;
        for (String name : names) {
            reverse[i]=name;
            i--;
            }
        System.out.println(Arrays.toString(reverse));

        System.out.println("----------------------");

        for (int i1 = names.length - 1,j=0; i1 >= 0; i1--,j++) {
            reverse[j]=names[i1];
        }
        System.out.println(Arrays.toString(reverse));
    }

    }

