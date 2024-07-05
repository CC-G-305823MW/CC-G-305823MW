package Aufgaben2;

import java.util.Scanner;

public class posNEGzahl {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben sie eine ganze Zahl (integer) ein.");
		int zahl = scanner.nextInt();
				
		if(zahl % 2 == 0 && zahl > 0) {
		System.out.println(zahl +" ist eine gerade Zahl! & sie ist positiv!");					}
				
		else if(zahl % 2 == 1 && zahl > 0) {
		System.out.println(zahl +" ist eine ungerade Zahl! & sie ist positiv!");			}
		
		else if (zahl % 2 == 1 && zahl < 0) {
		System.out.println(zahl +" ist eine ungerade Zahl! & sie ist negativ!");	}
	
		else if (zahl % 2 == 0 && zahl < 0) {
		System.out.println(zahl +" ist eine gerade Zahl! & sie ist negativ!");				}

		else {
		System.out.println(zahl +" ist eine gerade Zahl! & sie ist weder negativ noch positiv!");			}
				
		scanner.close();
			
	}
}

