package day44_Animal.animal;

public final class Dog extends Animal{

    public Dog(String name, String breed, String color, char gender, int age, String size) {
        super(name, breed, color, gender, age, size);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eats pizza");
    }
}
