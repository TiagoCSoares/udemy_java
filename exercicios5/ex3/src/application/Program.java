package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.print("Nome e notas: ");
		student.name= sc.nextLine();
		student.n1 =  sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		//Saída
		System.out.printf("Final Grade = %.2f\n", student.finalGrade());
		
		if(student.finalGrade() >= 60) {
			System.out.printf("Pass\n");
		}
		else {
			System.out.printf("Failed\nMissing: %.2f points", student.missingPoints());
		}
		
		sc.close();
	}

}
