package day10_NestedIf;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int month=15;
        String name="";
        if (month>=1&&month<=12){
            if (month==1){
                name="January";
            }else if (month==2){
                name="February";
            }else if (month==3){
                name="March";
            }else if (month==4){
                name="April";
            }else if (month==5) {
                name = "May";
            }else if (month==6) {
                name = "June";
            }else if (month==7) {
                name = "July";
            }else if (month==8) {
                name = "August";
            }else if (month==9) {
                name = "September";
            }else if (month==10) {
                name = "October";
            }else if (month==11) {
                name = "November";
            }else{
                name="December";
            }
        }else{
            name="Invalid";

        } System.out.println(name);






    }
}
