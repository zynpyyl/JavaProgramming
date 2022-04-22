package day42_Exceptions;

public class DisAdvantageOfThrowsKeyword {

    public static void main(String[] args) {
        System.out.println("Hello");
 //     sleep(1000);
        System.out.println("Cydeo");
        MorningWorkOut.sleep(1000);
    }

    public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep((long)(seconds*1000));

    }

}
