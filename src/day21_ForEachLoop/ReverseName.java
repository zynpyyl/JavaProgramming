package day21_ForEachLoop;

public class ReverseName {
    public static void main(String[] args) {
        String[] names={"Cydeo School","Wooden Spoon","Java Programming","SQL Programming",
                "Selenium Automation","API Testing","Database Testing","Manual Testing"};
        for (String name : names) {
            String reverseName="";
            for (int i = name.length()-1; i>=0 ; i--) {
                reverseName+=name.charAt(i);
            }
            System.out.println(reverseName);
        }
        }
    }
