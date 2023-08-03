package ex7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x, y;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite as coordenadas: ");
		x = sc.nextFloat();
		y = sc.nextFloat();
		if(x == y && x == 0) {
			System.out.print("Origem");
		}
		else if(x == 0) {
			System.out.print("Eixo X");
		}
		else if(y == 0) {
			System.out.print("Eixo Y");
		}
		else if(x > 0 && y > 0) {
			System.out.print("Q1");
		}
		else if(x < 0 && y > 0) {
			System.out.print("Q2");
		}
		else if(x < 0 && y < 0) {
			System.out.print("Q3");
		}
		else if(x > 0 && y < 0) {
			System.out.print("Q4");
		}
		sc.close();
	}

}
