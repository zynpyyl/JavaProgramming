package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
    String str="AAABBCCC";
    String result="";
        for (int i = 0; i <str.length(); i++) {
            if(result.contains(str.charAt(i)+"")){
                continue;
            }
            result+=str.charAt(i);
        }

        System.out.println(result);

    }
}
