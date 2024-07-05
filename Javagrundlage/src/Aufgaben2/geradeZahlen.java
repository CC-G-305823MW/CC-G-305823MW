package Aufgaben2;

import java.util.Scanner;

public class geradeZahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner scanner = new Scanner(System.in);

				System.out.println("Geben sie eine natürliche Zahl ein.");
				int zahl = scanner.nextInt();
				
				if(zahl % 2 == 0) {
				System.out.println(+zahl +" ist eine gerade Zahl!");			}
		
				else {
					System.out.println(zahl +" ist eine ungerade Zahl!");	    }
	
				scanner.close();
			}
	
	}