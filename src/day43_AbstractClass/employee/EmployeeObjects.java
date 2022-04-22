package day43_AbstractClass.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        //Person person=new Person("Zeynep",42,'F');

        //Employee employee=new Employee("Beyza",20,'F',"SDET",1232,10000);

        Tester tester=new Tester("Elif",40, 'F',"QA",1566,90000);

        Developer developer=new Developer("Ramazan",39,'M',"Developer",881,120000);

        System.out.println(tester);
        System.out.println(developer);

        tester.work();
        tester.bugReport();
        tester.eat();
        developer.work();
        developer.eat();
        developer.unitTest();


    }

}
