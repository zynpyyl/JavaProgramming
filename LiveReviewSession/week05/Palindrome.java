package week05;

public class Palindrome {
    public static void main(String[] args) {
        String word="madam";
        if((""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0)).equals(word)){
            System.out.println("palindrome");
        }else{

        System.out.println("not");}
}}
