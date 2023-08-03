package ex3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, x;
		System.out.print("Digite os valores de a, b, c, d: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		x = (a * b - c * d);
		System.out.printf("O valor da diferença do produto é: %d", x);
		/*  Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 *  calcule e mostre a diferença do produto
		 *  de A e B pelo produto de C e D segundo a fórmula: 
		 *  DIFERENCA = (A * B - C * D).
		 */
		
		sc.close();
	}

}
