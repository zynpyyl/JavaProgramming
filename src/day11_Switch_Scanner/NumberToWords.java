package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        int num = 12;
        String word=(num >= 0 && num <= 9)? (num == 0)? "zero" :(num == 1)? "one" :(num == 2)? "two" :(num == 3)? "three"
                    :(num == 4)? "four" :(num == 5)? "five" :(num == 6)? "six" :(num == 7)? "seven"
                    :(num == 8)? "eight" : "nine": "Invalid";

        System.out.println(word);
        System.out.println("------------");
        int number=12;
        String word1="";
        switch(number){
            case 0 :
                word1="Zero";
                break;
            case 1:
                word1="One";
                break;
            case 2:
                word1="Two";
                break;
            case 3:
                word1="Three";
                break;
            case 4:
                word1="Four";
                break;
            case 5:
                word1="Five";
                break;
            case 6:
                word1="Six";
                break;
            case 7:
                word1="Seven";
                break;
            case 8:
                word1="Eight";
                break;
            case 9:
                word1="Nine";
                break;
            default:
                word1="Invalid";

        }

        System.out.println(number+" = "+word1);







    }
}
