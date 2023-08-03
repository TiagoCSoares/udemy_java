package ex6;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
		Em seguida, calcule e mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.
		 */
		
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.print("Digite os valores de A,B e C: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		System.out.printf("Área do triângulo: %.4f\n", a*b/2);
		System.out.printf("Área do circulo: %.4f\n", Math.pow(c, 2)*3.14159);
		System.out.printf("Área do trapézio: %.4f\n", (a+b)*c/2);
		System.out.printf("Área do quadrado: %.4f\n", b*b);
		System.out.printf("Área do retângulo: %.2f\n", a*b);
		
		
		
		sc.close();
	}

}
