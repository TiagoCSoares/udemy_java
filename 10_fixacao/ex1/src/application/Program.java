package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n; 
		
		System.out.print("Quantos números voce vai digitar:? ");
		n = sc.nextInt();
		int vect[] = new int[n];		
		
		int i;
		for(i = 0;i < vect.length;i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		for(i = 0;i < vect.length;i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
		
	}


}
