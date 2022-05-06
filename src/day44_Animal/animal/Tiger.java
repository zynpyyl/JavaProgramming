package day44_Animal.animal;

public final class Tiger extends Animal implements WildAnimal{


    public Tiger(String name, String breed, String color, char gender, int age, String size) {
        super(name, breed, color, gender, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }

    @Override
    public void hunt() {

    }
}
