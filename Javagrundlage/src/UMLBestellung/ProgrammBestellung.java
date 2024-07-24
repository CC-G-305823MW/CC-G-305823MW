package UMLBestellung;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import utils.IO;
import java.util.Date;

public class ProgrammBestellung {

	public static void main(String[] args) {

		Verkaeufer saftLaden = new Verkaeufer("SaftLaden");

		List<Produkt> produktListe = new ArrayList<Produkt>();
		Produkt produkt1 = new Produkt(1, "Apfelsaft", 2.99);
		produktListe.add(produkt1);
		Produkt produkt2 = new Produkt(2, "Orangensaft", 1.99);
		produktListe.add(produkt2);

		saftLaden.setProdukte(produktListe); // Verkäufer Angebot

		Kunde kunde1 = new Kunde(1, "Martin", "bei@spiel.de", "Bruchtal 69");
		
		Warenkorb warenkorb1 = new Warenkorb(kunde1);
		
		boolean auswahl = true;
		while (auswahl) {
			
			int x = IO.promptAndReadInt("Welches Produkt möchten sie dem Warenkorb hinzufügen? "
					+ "Wähle 1 für Apfelsaft oder 2 für Orangensaft."
					+ "Wähle 3 wenn du fertig bist.");
			switch (x) {
				case 1: 
					warenkorb1.produktHinzufuegen(produkt1);
					break;
					// Anzahl abfragen
				case 2:
					warenkorb1.produktHinzufuegen(produkt2);
					break;
				case 3:
					auswahl = false;
					break;
				default:
					System.out.println("Falsche Eingabe, wähle 1 oder 2.");
					break;
			}
			
		}
		
		
		
		// System.out.println(warenkorb);
		 //System.out.println( warenkorb1.getGesamtsumme());
			
		Bestellung bestellung1 = new Bestellung(1, kunde1, warenkorb1,
				warenkorb1.getGesamtsumme());
	
		System.out.println(bestellung1);
	}
}
