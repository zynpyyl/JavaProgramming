package day46;

import day43_AbstractClass.employee.Developer;
import day43_AbstractClass.employee.Employee;
import day43_AbstractClass.employee.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day46_EmployeeTask {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };
        List<Employee> scrumMembers = new ArrayList<>(Arrays.asList(employees));

        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();

        for (Employee employee : employees) {
            if(employee instanceof Tester)
                testers.add((Tester) employee);
            if(employee instanceof Developer)
                developers.add((Developer) employee);
        }

        double minSalary=Double.MAX_VALUE;
        double maxSalary=Double.MIN_VALUE;

        Tester testerMaxSalary=null;
        Tester testerMinSalary=null;

        for (Tester tester : testers) {
            if(tester.getSalary()>maxSalary){
                maxSalary= tester.getSalary();
                testerMaxSalary=tester;
            }
            if(tester.getSalary()<minSalary){
                minSalary= tester.getSalary();
                testerMinSalary=tester;
            }
        }

        minSalary=Double.MAX_VALUE;
        maxSalary=Double.MIN_VALUE;

        Developer developerMaxSalary=null;
        Developer developerMinSalary=null;

        for (Developer developer : developers) {
            if(developer.getSalary()>maxSalary){
                maxSalary= developer.getSalary();
                developerMaxSalary=developer;
            }
            if(developer.getSalary()<minSalary){
                minSalary= developer.getSalary();
                developerMinSalary=developer;
            }
        }

        System.out.println(testerMaxSalary);
        System.out.println(testerMinSalary);
        System.out.println(developerMaxSalary);
        System.out.println(developerMinSalary);

}}
