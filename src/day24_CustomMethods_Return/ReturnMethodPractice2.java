package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String str = grade(95);
        String note = str.equals("A") ? "Excellent" : str.equals("B") ? "Great" : str.equals("C") ? "Good" : "Passed";
        System.out.println(note);
    }


    public static String grade(int score) {
        String result;
        if (score < 0 || score > 100) {
            result = "Invalid";
        } else {

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }
        System.out.println(result);
        return result;

    }
}

//create a function that can calculate the grade
//check the grade
//'A'----> Excellent
//'B'----> Great