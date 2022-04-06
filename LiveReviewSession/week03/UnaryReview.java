package week03;

public class UnaryReview {
    public static void main(String[] args) {

        int a=20;
        System.out.println(a++);
        System.out.println(a);

        int x=20;
        if(++x>12){
            System.out.println("x in the IF statement :"+x );
        }else{
            System.out.println("x in the ELSE statement :"+x);
        }

        int y=12;
        if(y++>12){
            System.out.println("y in the IF statement :"+y );
        }else{
            System.out.println("y in the ELSE statement :"+y);
        }



    }
}
