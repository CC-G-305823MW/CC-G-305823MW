package UMLBestellung;

import java.util.Date;

public class Bestellung {

	private int bestellId;
	
	private Kunde kunde;
	
	private Warenkorb warenkorb;
	
	private double gesamtBetrag;
	
	private Date datum;

	public int getBestellId() {
		return bestellId;
	}

	public void setBestellId(int bestellId) {
		this.bestellId = bestellId;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public Warenkorb getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(Warenkorb warenkorb) {
		this.warenkorb = warenkorb;
	}

	public double getGesamtBetrag() {
		return gesamtBetrag;
	}

	public void setGesamtBetrag(double gesamtBetrag) {
		this.gesamtBetrag = gesamtBetrag;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "Bestellung [bestellId=" + bestellId + ", kunde=" + kunde + ", warenkorb=" + warenkorb
				+ ", gesamtBetrag=" + gesamtBetrag + ", datum=" + datum + "]";
	}

	public Bestellung(int bestellId, Kunde kunde, Warenkorb warenkorb, double gesamtBetrag) {
		super();
		this.bestellId = bestellId;
		this.kunde = kunde;
		this.warenkorb = warenkorb;
		this.gesamtBetrag = gesamtBetrag;
		
	}
	
}
