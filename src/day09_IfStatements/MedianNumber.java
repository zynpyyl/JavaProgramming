package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        
        int num1=30;
        int num2=10;
        int num3=20;

        if ((num2>num1&&num3>num2)||(num2>num3&&num1>num2)){
            System.out.println(num2+" is the median number");
        }
        if ((num3>num1&&num2>num3)||(num3>num2&&num1>num3)){
            System.out.println(num3+" is the median number");
        }
        if ((num1>num2&&num3>num1)||(num1>num3&&num2>num1)){
            System.out.println(num1+" is the median number");
        }

    }




}
