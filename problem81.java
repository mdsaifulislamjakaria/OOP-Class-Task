// problem 8(a);
import java.util.*;

abstract class Employee {
    protected String name,department;
    protected int id;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract double calculatePay();

    public void displayInfo() {
        System.out.println("ID : " + id + ", Name : " + name + ", Department : " + department);
    }
}

class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department); 
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;

    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }
}

public class problem81 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            FullTimeEmployee ft = new FullTimeEmployee("Rahim", 101, "IT", 50000.0);
            PartTimeEmployee pt = new PartTimeEmployee("Karim", 102, "Marketing", 500.0, 80);
            ContractEmployee ce = new ContractEmployee("Kamal", 103, "Design", "Website Project", 150000.0);

            System.out.println("Full Time Employee");
            ft.displayInfo();
            System.out.println("Salary : " + ft.calculatePay() + " taka");

            System.out.println("\nPart Time Employee");
            pt.displayInfo();
            System.out.println("Salary : " + pt.calculatePay() + " taka");

            System.out.println("\nContract Employee");
            ce.displayInfo();
            System.out.println("Salary : " + ce.calculatePay() + " taka");
        }
    }
}
