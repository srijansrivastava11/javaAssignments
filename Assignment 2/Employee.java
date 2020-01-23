import java.util.Scanner;

public class Employee {
	public String name;
	public int age;
	public Gender gender;
	public double salary;
	
	public Employee(String name, int age, Gender gender, int salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
//		Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter salary");
//    	Employee.salary = sc.nextInt();
    	
	}
	
	public enum Gender {
		MALE, 
		FEMALE
	}
	
	public String getName() {
		return this.name;
	}
}
