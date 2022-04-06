package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {
        int num=7;
        String day;
        if (num==1){
            //System.out.println("Pazartesi");
            day="Monday";
        }
        else if(num==2){
            //System.out.println("Sali");
            day="Tuesday";
        }
        else if (num==3){
            //System.out.println("Carsamba");
            day="Wednesday";
        }
        else if (num==4){
            //System.out.println("Persembe");
            day="Thursday";
        }
        else if (num==5){
            //System.out.println("Cuma");
            day="Friday";

        }
        else if (num==6){
            //System.out.println("Cumartesi");
            day="Saturday";
        }
        else{
            //System.out.println("Pazar");
            day="Sunday";
        }

        System.out.println(day);
    }
}
