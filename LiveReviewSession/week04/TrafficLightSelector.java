package week04;

public class TrafficLightSelector {
    public static void main(String[] args) {
        char color='R';
        switch(color) {
            case 'R':
            case 'r':
                System.out.println("Red light");
                break;
            case 'O':
            case 'o':
                System.out.println("Orange Light");
                break;
            case 'G':
            case 'g':
                System.out.println("Green Light");
                break;
            default:
                System.out.println("Invalid");
        }








    }
}
