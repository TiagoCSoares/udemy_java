package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		String name[] = new String[n];
		double nota_1[] = new double[n];
		double nota_2[] = new double[n];
		
		for(int i = 0; i < name.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", (i+1));
			sc.nextLine();
			name[i] = sc.nextLine();
			nota_1[i] = sc.nextDouble();
			nota_2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i < n; i++) {
			media = (nota_1[i]+nota_2[i])/2;
			if(media >= 6) {
				System.out.println(name[i]);
			}
		}
		sc.close();
		
	}

}
