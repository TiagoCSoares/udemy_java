package alturas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media = 0, menos_16 = 0;
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		String name[] = new String[n];
		int age[] = new int[n];
		double height[] = new double[n];
		
		
		for(int i =0;i < name.length;i++) {
			System.out.printf("Dados da %d pessoa:\n", (i+1));
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
			media += height[i];
			if(age[i] < 16) {
				menos_16 += 1; 
			}
		}
		System.out.printf("Altura média: %.2f\n", media/n);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", 100*menos_16/n);
		for(int i = 0; i < name.length;i++) {
			if(age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		
		sc.close();
		
	}

}
