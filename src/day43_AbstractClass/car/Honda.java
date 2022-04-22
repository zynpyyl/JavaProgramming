package day43_AbstractClass.car;

public final class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Switch the key to ignition");
    }


}
