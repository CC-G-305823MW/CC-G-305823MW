package UMLBestellung;

import java.util.ArrayList;
import java.util.List;

import utils.IO;

public class ProgrammBestellung {

	public static void main(String[] args) {

		Verkaeufer saftLaden = new Verkaeufer("SaftLaden");

		List<Produkt> produktListe = new ArrayList<Produkt>();
		Produkt produkt1 = new Produkt(1, "Apfelsaft", 2.99);
		produktListe.add(produkt1);
		Produkt produkt2 = new Produkt(2, "Orangensaft", 1.99);
		produktListe.add(produkt2);

		saftLaden.setProdukte(produktListe); 		// Verkäufer Angebot

		Kunde kunde1 = new Kunde(1, "Martin", "bei@spiel.de", "Bruchtal 69");

		List<Warenkorb> warenkorb = new ArrayList<Warenkorb>();

		
		// Produkt zu Warenkorb hinzufügen
		int produktId = IO.promptAndReadInt(
				"Welches Produkt möchten sie hinzufügen?" + " Wähle '1' für Apfelsaft oder '2' für Orangensaft.");

		switch (produktId) {
		case 1:
			warenkorb.add((Warenkorb) produkt1);
			break;
		case 2:
			warenkorb.add((Warenkorb) produkt2);
			break;
		default:
			System.out.println("Unpassende Eingabe. Bitte wähle 1 oder 2.");
		}
		System.out.println(warenkorb);
		
		int anzahl = IO.promptAndReadInt("Wie viele Einheiten möchten sie kaufen? Geben sie eine ganze Zahl ein");
		switch (anzahl) {
		case 1:
			;
		default:
			System.out.println("Fehler. Es wurde keine ganze Zahl eingegeben.");
		}
		System.out.println("Anzahl: " +anzahl);

	}
}
