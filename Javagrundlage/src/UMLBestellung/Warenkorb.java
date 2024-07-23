package UMLBestellung;

import java.util.List;

public class Warenkorb extends Produkt {

	protected List<Warenkorb> warenkorb;

	protected int anzahl;

	protected double gesamtsumme;

	public List<Warenkorb> getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(List<Warenkorb> warenkorb) {
		this.warenkorb = warenkorb;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public double getGesamtsumme() {
		return gesamtsumme;
	}

	public void setGesamtsumme(double gesamtsumme) {
		this.gesamtsumme = preis * anzahl;
	}

	@Override
	public String toString() {
		return "Warenkorb [warenkorb=" + warenkorb + ", anzahl=" + anzahl + ", gesamtsumme=" + gesamtsumme + "]";
	}

	public Warenkorb(int produktId, String bezeichnung, double preis, List<Warenkorb> warenkorb, int anzahl,
			double gesamtsumme) {
		super(produktId, bezeichnung, preis);
		this.warenkorb = warenkorb;
		this.anzahl = anzahl;
		this.gesamtsumme = gesamtsumme;
	}

}
