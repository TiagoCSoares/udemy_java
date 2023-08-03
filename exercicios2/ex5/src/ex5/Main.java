package ex5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código e a quantidade");
		x = sc.nextInt();
		y = sc.nextInt();
		
		switch(x){
		case 1:
			System.out.printf("Total: %.2f", y*4.0);
			break;
		case 2:
			System.out.printf("Total: %.2f", y*4.5);
			break;
		case 3:
			System.out.printf("Total: %.2f", y*5.0);
			break;
		case 4:
			System.out.printf("Total: %.2f", y*2.0);
			break;
		case 5:
			System.out.printf("Total: %.2f", y*1.5);
			break;
		default:
			System.out.print("Inválido");
		}


		sc.close();

}
}
