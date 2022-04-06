package day24_CustomMethods_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {

         String removed=removeDuplicates("aaabbbcccddeeff");
        System.out.println(removed);



    }


    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String ch=str.charAt(i)+"";
            if(!result.contains(ch))
                result+=ch;
        }
        return result;
    }





}
