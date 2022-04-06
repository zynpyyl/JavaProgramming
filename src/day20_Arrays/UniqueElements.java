package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words={"Java","Java","C#","Phyton","Phyton"};
        for (int i = 0; i < words.length; i++) {
            int count=0;
            for (int i1 = 0; i1 < words.length; i1++) {
                if(words[i].equals(words[i1])){
                count++;
            }}
            if(count==1){
                System.out.println(words[i]);
            }
        }

}}
