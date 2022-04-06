package day24_CustomMethods_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("Hello world");

        nameOfMonth(12);


    }


    public static void nameOfMonth(int month){
        String result="";
        if(month<0||month>12) {
            System.out.println("Invalid");
            return; //exits the method
            //System.exit(0); exits the system
        }
        result = (month == 1) ? "January" : (month == 2) ? "February" : (month == 3) ? "March" : (month == 4) ? "April" : (month == 5) ? "May" : (month == 6) ? "June"
                : (month == 7) ? "July" : (month == 8) ? "August" : (month == 9) ? "September" : (month == 10) ? "October" : (month == 11) ? "November" : "December";
        System.out.println(result);
    }


}
