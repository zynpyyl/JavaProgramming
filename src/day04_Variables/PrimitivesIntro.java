package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age: 38 years old
        byte age = 38;

        //weight: 160 pounds
       // byte weight = 160; 160 is out of byte range

        short weight=160;
        //salary:100.000 $
        // short salary=100.000;  100.000 is out of short range

        int salary=100_000; // preferred

       // int asset=3_333_333_333; out of int range

        //long salary=3_333_333_333; // by default compiler takes the type as int
        long asset=3_333_333_333L; // add L or l , to force compiler

        // tax: 0.26

        float tax = 0.26f; // compiler takes the type as double, to force add f or F

        double PI = 3.14;















    }



}
