package day44_Animal.animal;

public class Eagle extends Animal implements WildAnimal,Flyable{


    public Eagle(String name, String breed, String color, char gender, int age, String size) {
        super(name, breed, color, gender, age, size);
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {

    }
}
