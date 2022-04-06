package week02;

public class PrimitivesExample {
    public static void main(String[] args) {
        int num1=123;
        int num2=456;
        short num=12348;
        int distance=1000000;

        System.out.println("Before Swapping Values");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("After Swapping");
        num2=num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Explicit Casting");
        num2=(short)distance;
        System.out.println("num2 = " + num2);





    }





}
