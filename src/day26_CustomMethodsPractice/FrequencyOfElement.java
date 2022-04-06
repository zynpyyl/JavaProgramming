package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,1,2,3,1,1,1,1,1};
        int n=frequencyOfElement(arr,1);
        System.out.println(n);
        double[] arr1={1.5,2.5,2.5};
        int n1=frequencyOfElement(arr1,2.5);
        System.out.println(n1);
        char[] arr2={'a','b','c','c'};
        int n2=frequencyOfElement(arr2,'a');
        System.out.println(n2);
        String[] arr3={"aaaa","dddd","ffff","gggg","aaaa"};
        int n3=frequencyOfElement(arr3,"aaaa");
        System.out.println(n3);


    }

    public static int frequencyOfElement(int[] arr,int num){
        int count=0;
        for (int each : arr) {
            if(each==num)
                count++;
        }
        return count;

    }
    public static int frequencyOfElement(double[] arr,double num){
        int count=0;
        for (double each : arr) {
            if(each==num)
                count++;
        }
        return count;

    }
    public static int frequencyOfElement(char[] arr,char ch){
        int count=0;
        for (char each : arr) {
            if(each==ch)
                count++;
        }
        return count;

    }
    public static int frequencyOfElement(String[] arr,String str){
        int count=0;
        for (String each : arr) {
            if(each.equals(str))
                count++;
        }
        return count;

    }
}
