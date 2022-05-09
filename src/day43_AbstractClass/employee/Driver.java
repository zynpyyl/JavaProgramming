package day43_AbstractClass.employee;

public final class Driver extends Employee{

    public Driver(String name, int age, char gender,  int id,String jobTitle, double salary) {
        super(name, age, gender,  id, jobTitle,salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" sleeps 9 hours");
    }
}
