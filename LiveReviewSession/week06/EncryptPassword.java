package week06;

public class EncryptPassword {
    public static void main(String[] args) {
        String str="cydeo";
        String str1="";
        for (int i = 0; i <str.length() ; i++) {
            str1+=str.charAt(i)+"x";
        }
        System.out.println(str1);
    }
}
/*
     * Given a string password. Encrypt with "x" a given password
     * and print.
     * (do with for loop)
     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
     */
