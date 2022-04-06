package day12_Scanner;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double salary,stateTax,federalTax,totalTax,netIncome;
        System.out.println("Please enter the hourly rate: ");
        double hourlyRate= scan.nextDouble();
        System.out.println("Please enter the weekly working hour: ");
        double workHours=scan.nextDouble();
        System.out.println("Please enter the state tax: ");
        double stateTaxRate= scan.nextDouble();
        System.out.println("Please enter the federal tax: ");
        double federalTaxRate=scan.nextDouble();
        scan.close();
        salary=hourlyRate*workHours*52;
        stateTax=salary*stateTaxRate;
        federalTax=salary*federalTaxRate;
        totalTax=stateTax+federalTax;
        netIncome=salary-totalTax;
        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);






    }
}
/*
    3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
            3.4.1 salary
            3.4.2 stateTax
            3.4.3 federalTax
            3.4.4 totalTax
            3.4.5 netIncome
 */