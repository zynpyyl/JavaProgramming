package day24_CustomMethods_Return;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReturnStatement2 {
    public static void main(String[] args) {

nameOfMonth(15);

    }


    public static void nameOfMonth(int month){
        String result="";
        if(month<0||month>12) {
            System.out.println("Invalid");
            return;
        }
            result = (month == 1) ? "January" : (month == 2) ? "February" : (month == 3) ? "March" : (month == 4) ? "April" : (month == 5) ? "May" : (month == 6) ? "June"
                    : (month == 7) ? "July" : (month == 8) ? "August" : (month == 9) ? "September" : (month == 10) ? "October" : (month == 11) ? "November" : "December";
            System.out.println(result);
    }
}
