package day15_ForLoops;

public class Alphabet {
    public static void main(String[] args) {

        for(char i='a'; i<='z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i='A'; i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i='Z'; i>='A'; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i='z';i>='a';i--){
            System.out.print(i+" ");
        }
        System.out.println();


        for(char i=1; i<=4000; i++){
            System.out.print(i+" ");
        }



    }
}
