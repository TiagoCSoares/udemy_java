package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor
* da área deste círculo com quatro  casas decimais conforme exemplos.
*Fórmula da área: area = π . raio2    Considere o valor de π = 3.14159
*/
	Scanner sc = new Scanner(System.in);	
	double x, y;
	System.out.print("Digite o valor do raio: ");
	x = sc.nextDouble();
	y = Math.pow(x,2) * 3.14159;
	System.out.printf("O valor da área é: %.4f \n" , y);
	
	
	sc.close();
		
	}

}
