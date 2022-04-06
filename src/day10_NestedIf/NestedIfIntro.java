package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score=50;

        if (score>=0&&score<=100){
            if (score>60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid score");
        }

        System.out.println("------------------------");

        int age=21;
        boolean hasId=false;

        if (hasId){
            if (age>=18){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol ");
            }
        }else{
            System.out.println("No ID");
        }

        System.out.println("----------------------");

            int day=8;
            String nameOfDay;

            if (day<=7 && day>=1){
                if (day==1){
                    nameOfDay="Sunday";
                }else if (day==2){
                    nameOfDay="Monday";
                }else if (day==3){
                    nameOfDay="Tuesday";
                }else if (day==4){
                    nameOfDay="Wednesday";
                }else if (day==5){
                    nameOfDay="Thursday";
                }else if (day==6){
                    nameOfDay="Friday";
                }else{
                    nameOfDay="Saturday";
                }
                System.out.println(nameOfDay);
            }else{
                System.out.println("Invalid number");
            }





    }
}
