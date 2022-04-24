package day44_Animal.animal;

public abstract class Animal {

    private String name;
    private final String breed,color;
    private final char gender;
    private int age;
    private String size;

    public Animal(String name, String breed, String color, char gender, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void eat();

    public void drink(){
        System.out.println(name+" drinks water");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
