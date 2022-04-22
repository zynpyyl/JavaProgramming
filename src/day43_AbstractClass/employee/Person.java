package day43_AbstractClass.employee;

public abstract class Person {

    private final String name;
    private int age;
    private final char gender;

    public Person(String name, int age,char gender) {
        this.name = name;
        setAge(age);
        if(!(gender=='M'||gender=='F'))
            throw new RuntimeException("Invalid gender: "+gender);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0)
            throw new RuntimeException("Invalid age: "+age);
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public abstract void sleep();

    public void eat(){
        System.out.println(name+" is eating baklava");
    };

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
