package utilities;

public class MathUtility {
    //returns the sum of two integers
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    //returns the sum of two decimals
    public static double sum(double num1,double num2){
        return num1+num2;
    }
    //returns the subtraction of two integers
    public static int subtraction(int num1,int num2){
        return num1-num2;
    }
    //returns the subtraction of two decimals
    public static double subtraction(double num1,double num2){
        return num1-num2;
    }
    //returns the multiplication of two integers
    public static int multiplication(int num1,int num2){
        return num1*num2;
    }
    //returns the multiplication of two decimals
    public static double multiplication(double num1,double num2){
        return num1*num2;
    }
    //passes two double parameters and returns the division result
    public static double division(double num1,double num2){
        return num1/num2;
    }
    //checks if an integer is even number,returns boolean
    public static boolean isEven(int num1){
        return (num1%2==0);
    }
    //checks if an integer is odd number,returns boolean
    public static boolean isOdd(int num1){
        return (num1%2==1);
    }
    //returns the maximum number between two integers
    public static int max(int num1,int num2){
        if(num1>num2) return num1;
        return num2;
    }
    //returns the maximum number between two decimals
    public static double max(double num1,double num2){
        if(num1>num2) return num1;
        return num2;
    }
    //returns the minimum number between two integers
    public static int min(int num1,int num2){
        if(num1>num2) return num2;
        return num1;
    }
    //returns the minimum number between two decimals
    public static double min(double num1,double num2){
        if(num1>num2) return num2;
        return num1;
    }
    //returns the square of an integer
    public static int square(int num1){
        return num1*num1;
    }
    //returns the square of a double
    public static double square(double num1){
        return num1*num1;
    }
    //return the cube of an integer
    public static int cube(int num1){
        return num1*num1*num1;
    }
    //return the cube of a double
    public static double cube(double num1){
        return num1*num1*num1;
    }

    








}
