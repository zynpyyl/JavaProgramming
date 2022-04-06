package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students={"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String[] earlyBirds= Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("-------------------------");

        int[] scores={10,20,30,40,50,60,70,80,90,100};
        int[] scores1=Arrays.copyOfRange(scores,3,8);

        System.out.println(Arrays.toString(scores1));






    }
}
