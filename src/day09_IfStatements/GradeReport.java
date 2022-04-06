package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        /*
//90~100====>Excellent
//80~89====>Great
//70~79====>Good
//60~69====>Passed
//0~59=====>Failed
         */

        int score=75;
        String grade;
        if (score>=90){
            grade="Excellent";
        }
        else if (score>=80){
            grade="Great";
        }
        else if (score>=70) {
            grade = "Good";
        }
        else if (score>=60){
            grade="Passed";
        }
        else{
            grade="Failed";
        }
        System.out.println("grade = " + grade);



    }
}
