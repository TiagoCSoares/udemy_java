package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		
		System.out.print("Name:");
		employee.name = sc.nextLine();
		System.out.print("\nGross salary: ");
		employee.salary = sc.nextDouble();
		System.out.print("\nTax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n", employee.name, (employee.salary - employee.tax));
		
		System.out.print("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.printf("Update data: %s,$ %.2f", employee.name, (employee.salary - employee.tax));
		
		sc.close();
		
	}

}
