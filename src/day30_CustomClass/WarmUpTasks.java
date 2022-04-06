package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(numbers, 0, numbers.size() - 1);

        System.out.println(numbers);

        System.out.println("--------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int size = list.size();
        list.removeIf(p -> p == 0);
        int size1 = list.size();
        for (int i = 0; i < size - size1; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("--------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : list1) {
            if (integer != 0)
                result.add(integer);
        }
        for (Integer integer : list1) {
            if (integer == 0)
                result.add(integer);
        }
        System.out.println(result);

        System.out.println("--------------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> ch = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            ch.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(ch);
        ArrayList<Character> digits = new ArrayList<>(ch);
        ArrayList<Character> specialChars = new ArrayList<>(ch);

        letters.removeIf(p->!Character.isLetter(p));
        digits.removeIf(p->!Character.isDigit(p));
        //specialChars.removeIf(p->(letters.contains(p)||digits.contains(p)));
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        //specialChars.removeIf( p -> Character.isLetterOrDigit(p));

     /* for (Character each : ch) {
            if(Character.isLetter(each))
                letters.add(each);
            else if(Character.isDigit(each))
                digits.add(each);
            else
                specialChars.add(each);
        }  */
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);


    }
}
        

