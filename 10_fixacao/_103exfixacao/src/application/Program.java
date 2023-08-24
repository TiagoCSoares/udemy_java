package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int linha  = sc.nextInt();
		int coluna = sc.nextInt();
		
		int [][] matriz = new int[linha][coluna];
		for (int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int position = sc.nextInt();
		
		for (int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				if (matriz[i][j] == position) {
					System.out.println("Position: " + i + ", " + j + ":");
					int laux = i;
					int caux = j;
					if(caux > 0) {
						System.out.printf("Left: %d\n", (matriz[i][j-1]));
					}
					if(caux < (coluna-1)) {
						System.out.printf("Right: %d\n", (matriz[i][j+1]));
					}
					if(laux > 0) {
						System.out.printf("Up: %d\n", (matriz[i-1][j]));
					}
					if(laux < (linha-1)) {
						System.out.printf("Down: %d\n", (matriz[i+1][j]));
					}
				}
			}
		}
		
		sc.close();
	}

}
