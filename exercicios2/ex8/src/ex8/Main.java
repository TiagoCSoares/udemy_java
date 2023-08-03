package ex8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x, total, aux;
		total = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor: ");
		x = sc.nextFloat();
		
		if(x < 2000.01) {
			System.out.print("Isento");
		}
		if(x > 4500.00) {
			aux = x - 4500;
			total += aux*0.28;
			x -= aux;
		}	
		if(x > 3000.00) {
			aux = x - 3000;
			total += aux*0.18;
			x -= aux;
		}
		if(x > 2000.00) {
			aux = x - 2000;
			total += aux*0.08;
			System.out.printf("R$ %.2f", total);
			
		}
		
		sc.close();

		
	}

}
