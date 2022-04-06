package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {



        int max=maxNumber(100,200);
        System.out.println(max);

        int mult=max*2;




    }



    public static int maxNumber(int num1,int num2){
        int max=0;
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        return max;
    }


}
