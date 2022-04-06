package week09;
import java.util.Arrays;

public class xxx {
    public static void main(String[] args) {
        int[] arr = {3, 12, 3, 34, 12};

        for (int i : arr) {
            if (i == 3) {
                i = 4;
            }

        }


        System.out.println(Arrays.toString(arr));


    }

}



