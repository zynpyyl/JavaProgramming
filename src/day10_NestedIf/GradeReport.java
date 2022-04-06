package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int grade = 90;
        String result;

        if (grade > 0 && grade <= 100) {
            if (grade >= 90) {
                result = "Excellent";
            } else if (grade >= 80) {
                result = "Great";
            } else if (grade >= 70) {
                result = "Good";
            } else if (grade >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }

        } else {
            result = "Invalid grade";
        }
        System.out.println(result);

        System.out.println("-----------------------");

        String result1 = (grade > 0 && grade <= 100) ? (grade >= 90) ? "Excellent" : (grade >= 80) ? "Great" : (grade >= 70) ? "Good"
                : (grade >= 60) ? "Passed" : "Failed" : "Invalid grade";
        System.out.println(result1);

        System.out.println("-----------------------");

        String result2;
        if (grade > 0 && grade <= 100) {

            result2 = (grade >= 90) ? "Excellent" : (grade >= 80) ? "Great" : (grade >= 70) ? "Good" : (grade >= 60) ? "Passed" : "Failed";
        } else {
            result2 = "Invalid score";
        }
        System.out.println(result2);


    }
}
