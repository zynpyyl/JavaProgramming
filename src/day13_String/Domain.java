package day13_String;

import java.util.Scanner;

public class Domain {
    public static void main(String[] args) {
       /* String email="zeynepyayla@gmail.com";
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

        System.out.println("------------------");

        String str1="Java is fun, Java is cool";
        String s1,s2,s3; //Java is fun
        s1=str1.substring(0,11);
        s2=str1.substring(0,str1.indexOf(","));
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        s3=str1.substring(str1.indexOf(", ")+2);
        System.out.println("s3 = " + s3);             */
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String first=email.substring(0,email.indexOf("_"));
        String last=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("first = " + first);
        System.out.println("last = " + last);
        System.out.println("domain = " + domain);

        System.out.println(first.substring(0,1).toUpperCase()+first.substring(1));
        System.out.println(last.substring(0,1).toUpperCase()+last.substring(1));
        System.out.println(domain);






    }
}
