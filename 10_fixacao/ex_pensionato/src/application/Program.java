package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Rent[] rooms = new Rent[10];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Rent #%d\n", i);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			
			Rent rent = new Rent(name, email);
			rooms[roomNumber] = rent;
		}
		
		System.out.println("\nBusy rooms: ");
		for(int i = 0; i < 10; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		sc.close();
		
	}

}
