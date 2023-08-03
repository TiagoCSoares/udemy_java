package ex1;

import java.util.Scanner;


//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("Digite o primeiro valor:");
		x = sc.nextInt();
		System.out.print("Digite o segundo valor:");
		y = sc.nextInt();
		x = x + y;
		System.out.println("A soma dos valores é:" + x);
		
		sc.close();
	}	
	
}
