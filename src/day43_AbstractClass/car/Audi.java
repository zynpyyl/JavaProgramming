package day43_AbstractClass.car;

public final class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("Push the start button");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto parking");
    }
}
