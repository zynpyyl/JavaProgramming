package day24_CustomMethods_Return;

public class WarmupTasks {
    public static void main(String[] args) {

        initials("zeynep","Yayla");

        domain("zeynepyayla@gmail.com");

        nameOfMonth(12);

        daysInMonth(6);


    }

    public static void initials(String firstName,String secondName){

        System.out.println("initial="+firstName.toUpperCase().charAt(0)+"."+secondName.toUpperCase().charAt(0));

    }
    public static void domain(String email){

        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
    public static void nameOfMonth(int month){
        String result="";
        if(month>0||month<13) {
            result = (month == 1) ? "January" : (month == 2) ? "February" : (month == 3) ? "March" : (month == 4) ? "April" : (month == 5) ? "May" : (month == 6) ? "June"
                    : (month == 7) ? "July" : (month == 8) ? "August" : (month == 9) ? "September" : (month == 10) ? "October" : (month == 11) ? "November" : "December";
        }else{
            result="Invalid";
        }
        System.out.println(month+". month is "+result);
        }
    public static void daysInMonth(int month){
        String result="";
        int days=0;
        if(month<0||month>12){
            result="Invalid";
        }else{
            result = (month == 1) ? "January" : (month == 2) ? "February" : (month == 3) ? "March" : (month == 4) ? "April" : (month == 5) ? "May" : (month == 6) ? "June"
                    : (month == 7) ? "July" : (month == 8) ? "August" : (month == 9) ? "September" : (month == 10) ? "October" : (month == 11) ? "November" : "December";
        }
        switch(month){
            case 2 :
                days=28;
                break;
            case 4 : case 6 : case 9 : case 11 :
                days=30;
                break;
            default:
                days=31;
        }

        System.out.println(month+". month is "+result+" and has "+days+" days");

    }







    }









