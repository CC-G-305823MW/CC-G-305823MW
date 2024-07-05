package Aufgaben2;

import java.util.Scanner;

public class BankAccount {

	public static void main (String[] args) {
		
		double guthaben = 346.14	;
		
		System.out.println("Ihr Guthaben beträgt: " +guthaben +"€");
		System.out.println("Wie viel Geld möchten sie abheben");
		
		Scanner scanner = new Scanner(System.in);
		
		double abhebungsbetrag = scanner.nextDouble();
		
		if(abhebungsbetrag <= guthaben) {
			System.out.println("Alles gut, einen moment bitte, dann wird "+abhebungsbetrag +" € ausgezahlt.");
			guthaben = guthaben - abhebungsbetrag;
		System.out.println("Ihr neues Guthaben beläuft sich auf: " +Math.round(guthaben)+"€.");
		}
		
		else {
		System.out.println("Keine Auszahlung möglich! Der angegebene Betrag ist größer als ihr aktuelles Guthaben.");
		
		scanner.close();
		}
		
	}
}
