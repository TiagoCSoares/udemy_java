package ex4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fazer um programa que leia o número de um funcionário, seu número de 
		 * horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário.
		 *  A seguir, mostre o número e o salário do funcionário, com duas casas
	     * decimais.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		float hour, payment, phour;
		
		System.out.print("Digite o número do funcionário, seu número de "
				+ "horas trabalhadas e quanto ele recebe por hora:");
		
		num = sc.nextInt();
		hour = sc.nextFloat();
		payment = sc.nextFloat();
		phour = hour * payment;
		System.out.printf("O número do funcionário é: %d \nSeu salário é: %.2f\n" , num, phour);
		
		sc.close();
	}

}
