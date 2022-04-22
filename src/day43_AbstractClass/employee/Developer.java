package day43_AbstractClass.employee;

public final class Developer extends Employee {

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender, jobTitle, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" is sleeping 7 hours");
    }

    public void unitTest(){
        System.out.println(getJobTitle()+" "+getName()+" is unit testing");
    }
}
