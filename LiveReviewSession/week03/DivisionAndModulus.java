package week03;

public class DivisionAndModulus {
    public static void main(String[] args) {
        int inputseconds=4000;
        int hours,minutes,seconds;

        hours=inputseconds/(3600);
        minutes=(inputseconds%3600)/60;
        seconds=inputseconds%60;

        System.out.println(hours+" "+minutes+" "+seconds);






    }
}
