package day13_String;

public class StringMethod {
    public static void main(String[] args) {
        String word="Cydeo";
        char third=word.charAt(2);
        System.out.println("third = " + third);


        String word2="Java Programming Language";
        String s1;//first word
        String s2;//second word
        String s3;//last word

        s1=word2.substring(0,word2.indexOf(" ")+1);
        s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        s3=word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);






    }
}
