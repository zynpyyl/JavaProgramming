package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int num=2;
        int year=2001;
        String result="";
        if(num>=1&&num<=12) {
            switch (num) {
                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;
                case 2:
                    result=(year%4==0)? "29 days":  "28 days";
                    break;
                default:
                    result = "31 days";
            }
        }else{
            System.out.println("Invalid");
        }
        System.out.println(result);
        }

}
