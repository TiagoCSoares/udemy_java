package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fazer um programa para ler um número inteiro e 
		//dizer se este número é par ou ímpar.
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor: ");
		x = sc.nextInt();
		
		if(x%2 == 0) {
			System.out.print("Par");
		}
		else {
			System.out.print("Impar");
		}
		
		sc.close();
	}

}
