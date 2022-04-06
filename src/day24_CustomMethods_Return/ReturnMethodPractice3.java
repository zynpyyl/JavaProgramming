package day24_CustomMethods_Return;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {

        String str="aaabbcccd";
        for (int i = 0; i <str.length() ; i++) {
            int frequency=freqOfChar(str,str.charAt(i));
            if(frequency==1) {
                System.out.println(str.charAt(i));
            }
        }
    }

    public static int freqOfChar(String str,char ch){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch)
                    count++;
            }
       return count;

        }


}
