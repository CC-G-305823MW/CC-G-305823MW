package UMLBestellung;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

	protected List<Produkt> produkte;

	private Kunde kunde;

	protected double gesamtsumme;

	protected double preis;

	public List<Produkt> getProdukte() {
		return produkte;
	}
	
	public void setProdukte(List<Produkt> produkte) {
		this.produkte = produkte;
	}

	private double berechneGesamtSumme () {
		double summe = 0;
		for (Produkt produkt : this.produkte) {
			summe += produkt.getPreis();
		}
		return summe;
	}

	public double getGesamtsumme() {
		return berechneGesamtSumme();
	}

	@Override
	public String toString() {
		return "Warenkorb [produkte=" + produkte + ", gesamtsumme=" + gesamtsumme + "]";
	}

	public Warenkorb(Kunde kunde, List<Produkt> produkte) {
		this();
		this.kunde = kunde;
		this.produkte = produkte;
		
	}

	public void produktHinzufuegen(Produkt produkt) {
		this.produkte.add(produkt);
	}

	public Warenkorb(Kunde kunde) {
		this();
		this.kunde = kunde;
	}

	public Warenkorb() {
		super();
		this.produkte = new ArrayList<Produkt>();
	}
	
	
}
