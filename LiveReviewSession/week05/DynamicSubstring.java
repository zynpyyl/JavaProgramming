package week05;

public class DynamicSubstring {
    public static void main(String[] args) {
        String searchResult="result count:12345";
        searchResult.substring(searchResult.indexOf(":")+1);
        System.out.println(searchResult);
        System.out.println("------------------------");

        String word="Maybemaybemaybe";
        word=word.replace("ay","uy");
        System.out.println(word);

        String today="jsdhjgf [java] jhdjkgf";

        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));




    }
}
