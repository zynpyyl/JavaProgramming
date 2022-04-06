package week02;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {
        String name="";//hard coded way
        //output goes to console---print or println
        System.out.println("Output");
        //how can I receive input for my java class
       //1-create your scanner object(object name can be anything) you dont see anything
       Scanner input=new Scanner(System.in);
       //2-prompt the user for putting input
        System.out.println("Put your name:");//this is printed out to console
        //3-get the input

        name=input.next();//reads the data from console and assigns the value to my variable
        //4-use the value that I read
        System.out.println("name = " + name);
        //step 1 and 3 are MUST,2 and 4 depends on the situation
    }



}
