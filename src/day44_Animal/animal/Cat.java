package day44_Animal.animal;

public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, String color, char gender, int age, String size) {
        super(name, breed, color, gender, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }

    @Override
    public void play() {

    }
}
