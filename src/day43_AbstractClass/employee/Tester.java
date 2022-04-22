package day43_AbstractClass.employee;

public final class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender, jobTitle, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" is sleeping 5 hours");
    }

    public void bugReport(){
        System.out.println(getJobTitle()+" "+getName()+" is creating a bug report");
    }
}
