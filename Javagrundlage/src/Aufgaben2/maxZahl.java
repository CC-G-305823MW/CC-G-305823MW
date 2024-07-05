package Aufgaben2;

import java.util.Scanner;

public class maxZahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			Scanner scanner = new Scanner(System.in);
			System.out.println("Geben sie insgesamt 3 Zahlen ein.");
			System.out.println("Geben sie die erste Zahl ein.");
			int zahl1 = scanner.nextInt();
			System.out.println("Geben sie die zweite Zahl ein.");
			int zahl2 = scanner.nextInt();
						
			System.out.println("Geben sie die dritte und letzte Zahl ein.");
			int zahl3 = scanner.nextInt();
					
			int groß = Math.max(zahl1, zahl2);
			int groeßer = Math.max(groß, zahl3);	
		
			System.out.println("Die größte Zahl ist " +groeßer);			
						scanner.close();
					}
			
	
	}

