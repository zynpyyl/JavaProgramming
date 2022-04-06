package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1=5;
        int n2=6;
        char o='[';
        if(o=='+'|| o=='-'|| o=='/' || o=='*'){
            switch (o){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default :
                    System.out.println(n1/n2);
            }
        }else{
            System.err.println("invalid operator");
        }






    }
}
