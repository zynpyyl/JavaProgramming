package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int num=0;
        if (num>0){
            System.out.println(num+" is positive.");
        }
        else if (num<0){
            System.out.println(num+" is negative.");
        }
        else{
            System.out.println(num+" is zero,");
        }


    }
}
