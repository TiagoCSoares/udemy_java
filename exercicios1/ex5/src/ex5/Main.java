package ex5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler o código de uma peça 1, 
		 *o número de peças 1, o valor unitário de cada peça 1, o
	     *código de uma peça 2, o número de peças 2 e o valor unitário 
	     *de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Scanner sc = new Scanner(System.in);
		
		int p1, p2, num1, num2;
		float v1, v2, total;
		
		System.out.print("Digite o código da peça 1, a quantidade de peças e seu valor"
				+ "unitário: ");
		p1 = sc.nextInt();
		num1 = sc.nextInt();
		v1 = sc.nextFloat();
		
		System.out.print("Digite o código da peça 2, a quantidade de peças e seu valor)"
				+ "unitário: ");
		p2 = sc.nextInt();
		num2 = sc.nextInt();
		v2 = sc.nextFloat();
		
		total = num1*v1 + num2*v2;
		System.out.printf("O valor total a ser pago é: %.2f", total);
		
		sc.close();
	}

}
