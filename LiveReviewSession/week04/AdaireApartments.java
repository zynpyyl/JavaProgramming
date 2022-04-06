package week04;

public class AdaireApartments {
    public static void main(String[] args) {
        int num=5;
        String result;
        switch (num) {
            case (0) :
                result="Studio apartment selected\nstartingPrice -> 1454";
                break;
            case (1) :
                result="One bedroom apartment selected\nstartingPrice -> 1725";
                break;
            case (2) :
                result ="Two bedroom apartment selected\nstartingPrice -> 2899";
                break;
            default :
                result = num+ " bedroom currently unavailable";
        }
        System.out.println(result);
    }
}
