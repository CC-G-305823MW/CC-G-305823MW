package Aufgaben2;

import java.util.Scanner;

public class Wochentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben sie eine natürliche Zahl zwischen 1 & 7 ein.");
		int zahl = scanner.nextInt();
	
		switch (zahl) {
		case 1:
			System.out.println("Es ist Montag");
			break;
		case 2:
			System.out.println("Es ist Dienstag");
			break;
		case 3:
			System.out.println("Es ist Mittwoch");
			break;
		case 4:
			System.out.println("Es ist Donnerstag");
			break;
		case 5:
			System.out.println("Es ist Freitag");
			break;
		case 6:
			System.out.println("Es ist Samstag");
			break;
		case 7:
			System.out.println("Es ist Sonntag");
			break;
			
		default:
			System.out.println("ungültige Eingabe, nochmal.");

	
	scanner.close();
	}
	}
}
