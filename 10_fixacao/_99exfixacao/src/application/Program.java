package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("How many employees will be registered? ");
			int n = sc.nextInt();
			List <Employee> list = new ArrayList<>();
			
			
			for(int i = 0; i < n; i++) {
				
				System.out.printf("\nEmployee #%d\n", (i+1));
				System.out.print("Id: ");
				Integer id = sc.nextInt();
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Salary: ");
				Double salary = sc.nextDouble();
				
				Employee emp = new Employee(id,name,salary);
				
				list.add(emp);
 			}
			
			System.out.println("Enter the employee id that will have salary increase: ");
			int idsalary = sc.nextInt();
			
			//Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
			// ^^ essa linha equivale a implementação da função auxiliar position
			
			Integer pos = position(list, idsalary);
			if(pos == null) {
				System.out.println("This id not exist!");
			}
			else {
				System.out.print("ENter the percentage: ");
				double percent = sc.nextDouble();
				list.get(pos).increase(percent);
			}
			
			for(Employee emp : list) {
				System.out.println(emp);
			}
			
			sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
