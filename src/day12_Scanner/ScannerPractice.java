package day12_Scanner;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scan.nextInt();
        scan.nextLine();  // to read the enter key
        System.out.println("Enter your full name: ");
        String name=scan.nextLine();
        System.out.println("Enter your GPA: ");
        double score= scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your school name: ");
        String schoolName=scan.nextLine();
        scan.close();
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("score = " + score);
        System.out.println("schoolName = " + schoolName);






    }
}
