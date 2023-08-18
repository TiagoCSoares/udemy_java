package mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String name[] = new String[n];
		int age[] = new int[n];
		int i, mais_velho = 0, n_velho = 0;
		
		for(i = 0; i < name.length;i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			if(age[i] > mais_velho) {
				mais_velho = age[i];
				n_velho = i;
			}
		}
		System.out.printf("Pessoa mais velha: %s", name[n_velho]);
		sc.close();
		
	}

}
