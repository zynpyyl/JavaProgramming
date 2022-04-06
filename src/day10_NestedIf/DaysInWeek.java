package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int num=7;
        String day;
      /*  if (num==1){
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
    }*/


            day =(num==1)? "Sunday" :(num==2)? "Monday" :(num==3)? "Tuesday" :(num==4)? "Wednesday"
         :(num==5)? "Thursday" :(num==6)? "Friday" : "Saturday";
            System.out.println(day);





















    }
}




