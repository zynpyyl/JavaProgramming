package day08_LogicalOperators;

public class GradeReport {
    public static void main(String[] args) {
        int score=85;
        if (score>=90&&score<=100){
            System.out.println("Excellent");
        }
        if(score>=80&&score<90){
            System.out.println("Great");
        }
        if(score>=70&&score<80){
            System.out.println("Good");
        }
        if(score>=60&&score<70){
            System.out.println("Passed");
        }
        if(score<60){
            System.out.println("Failed");
        }
        System.out.println("------------------------");
        int score2=70;
        boolean isExcellent=score2>=90;
        boolean isGreat=score2<90&&score2>=80;
        boolean isGood=score2<80&&score2>=70;
        boolean isPassed=score2<70&&score2>=60;
        boolean isFailed=score2<60;
        if (isExcellent){
            System.out.println("Excellent");
        }
        if (isGreat){
            System.out.println("Great");
        }
        if (isGood){
            System.out.println("Good");
        }
        if(isPassed){
            System.out.println("Passed");
        }
        if(isFailed){
            System.out.println("Failed");
        }

        System.out.println("--------------------");

        int score3=57;
        boolean a=score3>=90;
        boolean b=score3>=80 && !a;
        boolean c=score3>=70 && !a && !b;
        boolean d=score3>=60 && !a && !b && !c;
        boolean e=score3<60;

        if (a){
            System.out.println("Excellent");
        }
        if (b){
            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Passed");
        }
        if(e){
            System.out.println("Failed");
        }




    }
}

//90~100====>Excellent
//80~89====>Great
//70~79====>Good
//60~69====>Passed
//0~59=====>Failed



