package day43_AbstractClass.car;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("Say start");
    }

    public void autopilot(){
        System.out.println(getModel()+" "+getBrand()+" has autopilot");
    }
}
