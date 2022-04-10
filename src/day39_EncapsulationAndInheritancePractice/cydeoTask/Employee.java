package day39_EncapsulationAndInheritancePractice.cydeoTask;

public class Employee extends Person {
    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender,int employeeId,String jobTitle,double salary){
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setGender(gender);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if(employeeId<0){
            System.out.println("invalid value for employeeId");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle==null||jobTitle.isEmpty()){
            System.out.println("Job title can not be null or empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.out.println("Salary can not ne negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                " employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */