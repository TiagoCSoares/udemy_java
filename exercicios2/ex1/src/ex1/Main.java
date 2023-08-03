package ex1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler um número inteiro, e
		//depois dizer se este número é negativo ou não.
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		
		x = sc.nextInt();
		
		if(x >= 0) {
			System.out.print("POSITIVO");
		}
		else {
			System.out.print("NEGATIVO");
		}
		
		sc.close();
	}

}
