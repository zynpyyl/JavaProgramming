package day44_Animal.animal;

public class Parrot extends Animal implements Playable,Flyable{

    public Parrot(String name, String breed, String color, char gender, int age, String size) {
        super(name, breed, color, gender, age, size);
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void play() {

    }
}
