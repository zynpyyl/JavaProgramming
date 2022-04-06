package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {
        String[] words={"Java","Java","C#","Phyton","Phyton"};
        for (String word : words) {
            int count=0;
            for (String each:words) {
                if(word.equals(each))
                    count++;
            }
            if(count==1)
                System.out.println(word+" is unique");
        }

    }
}
