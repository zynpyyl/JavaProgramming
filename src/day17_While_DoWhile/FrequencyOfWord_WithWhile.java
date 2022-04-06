package day17_While_DoWhile;

public class FrequencyOfWord_WithWhile {
    public static void main(String[] args) {

        String str="Java Java Phyton Java";
        int freq=0;
        while(str.contains("Java")){
            freq++;
            str=str.replaceFirst("Java","");
        }
        System.out.println(freq);

        System.out.println("------------------");

        String sentence="cat cat cat cat dog dog dog cat cat";
        int frequency=0;

        while(sentence.contains("cat")){
            frequency++;
            sentence=sentence.replaceFirst("cat","");
        }
        System.out.println(frequency);
        System.out.println("----------------");

        String str2="java java java phyton phyton phyton phyton java";
        int countJava=0;
        int countPhyton=0;
        while ((str2.contains("java"))||str2.contains("phyton")){
            if(str2.contains("java")){
            countJava++;
            str2=str2.replaceFirst("java","");
            }else{
                countPhyton++;
                str2=str2.replaceFirst("phyton","");
            }}

        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);


    }
}
