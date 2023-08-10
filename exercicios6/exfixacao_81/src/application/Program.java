package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int id = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is tehre an initial deposit (y/n)?");
		String aux = sc.next();
		
		double saldo = 0;
		if(aux.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			saldo = sc.nextDouble();
		}
		else if(aux.equals("n")) {
			saldo = 0;
		}
		else {
			System.out.println("\nErro na aplicação");
			sc.close();
			return;
		}
		
		Banco conta = new Banco(id, name, saldo);
		conta.setSaldo(saldo);
		
		System.out.println("\n" + conta);
		System.out.print("\nEnter a deposit value: ");
		
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		
		System.out.println("Updated " + conta);
		
		System.out.print("\nEnter a withdraw value: ");
		double saque  = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Updated " + conta);
		
		sc.close();
	}

}
