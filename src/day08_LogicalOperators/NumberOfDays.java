package day08_LogicalOperators;

public class NumberOfDays {
    public static void main(String[] args) {
        int num=4;
        boolean days28=num==2;
        boolean days30=num==4||num==6||num==9||num==11;
        boolean days31=!days28&&!days30;

        if (days28) {
            System.out.println(28);

        }
        if (days30){
            System.out.println(30);
        }
        if (days31){
            System.out.println(31);
        }


    }
}
