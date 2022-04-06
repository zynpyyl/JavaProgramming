package day18_NestedLoops;

public class Triangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("--------------");

        String s="";
        for (int i = 1; i <=10 ; i++) {
            s+="* ";
            System.out.println(s);

        }
        System.out.println("---------------");

        for (int i = 1; i <=10 ; i++) {
            System.out.println("* ".repeat(i));

        }

    }
}

//Use a nested loop to print the following shape
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * * * *
//        * * * * * * * *
//        * * * * * * * * *
//        * * * * * * * * * *