package week02;

public class CarInfo {
    public static void main(String[] args) {
        int year=2022;
        String make="Mercedes";
        String model="A180";
        boolean transmission=true;
        String color="black";
        int mileage=0;
        int price=100000;
        System.out.println(year+" "+make+" "+model+"\n"+"Automatic transmission:"+transmission);
        System.out.println(color+"-"+mileage+"kilometers"+" $"+price);

        double priceinTL=price*13.5;
        double taxRate=1.8;
        double priceAfterTax=priceinTL*(1+taxRate);
        System.out.println("Your favourite car is TL"+priceAfterTax);






    }
}
