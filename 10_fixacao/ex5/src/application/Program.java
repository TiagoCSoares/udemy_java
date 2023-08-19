package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);	
			
			int n, homens = 0;
			double media = 0, maior = 0, menor = 0, mulheres = 0;
			System.out.print("Quantas pessoas serão digitadas? ");
			n = sc.nextInt();
			Double altura[] = new Double[n];
			char genero[] = new char[n];

			System.out.printf("Altura da 1a pessoa: ");
			altura[0] = sc.nextDouble();
			System.out.printf("Genero da 1a pessoa: ");
			genero[0] = sc.next().charAt(0);
			maior = altura[0];
			menor = altura[0];
			 
			if(genero[0] == 'F') {
				mulheres += 1;
				media += altura[0];
			}
			if((genero[0] == 'M')) {
				homens += 1;
			}
			for(int i = 1;i < n;i++) {
				System.out.printf("Altura da %da pessoa: ", (i+1));
				altura[i] = sc.nextDouble();
				System.out.printf("Genero da %da pessoa: " , (i+1));
				genero[i] = sc.next().charAt(0);
				if(maior < altura[i]) {
					maior = altura[i];
				}
				if(menor > altura[i]) {
					menor = altura[i];
				}
				if(genero[i] == 'F') {
					mulheres += 1;
					media += altura[i];
				}
				if((genero[i] == 'M')) {
					homens += 1;
				}
			}
			
			media = media/mulheres;
			
			
			System.out.printf("Menor altura = %.2f", menor);
			System.out.printf("\nMaior altura = %.2f", maior);
			System.out.printf("\nMédia das alturas das mulheres = %.2f", media);
			System.out.printf("\nNúmero de homens = %d", homens);
		
			sc.close();
			
	}
}
