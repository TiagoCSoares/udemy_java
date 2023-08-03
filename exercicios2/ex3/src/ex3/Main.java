package ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Leia 2 valores inteiros (A e B). Após, o programa deve 
		//mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos são múltiplos entre si. "
		//Atenção: os números devem poder ser digitados em
		//ordem crescente ou decrescente.
		
		int a, b, aux;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite os valores");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a < b) {
			aux = a;
			a = b;
			b = aux;
		}
		if(a%b == 0) {
			System.out.print("São Múltiplos");
		}
		else { 
			System.out.print("Não são múltiplos");
		}
		
		sc.close();
	}

}
