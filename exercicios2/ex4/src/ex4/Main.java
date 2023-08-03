package ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
		//duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma 
		//duração mínima de 1 hora e máxima de 24 horas.
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a hora inicial e final:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x == y) {
			System.out.print("O jogo durou 24 horas");
		}
		else {
			System.out.printf("O jogo durou %d horas", (y-x));
		}
		
		
		sc.close();
	}

}
