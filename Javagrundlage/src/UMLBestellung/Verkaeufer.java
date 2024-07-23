package UMLBestellung;

import java.util.List;

public class Verkaeufer {

	protected String name;

	protected List<Produkt> produkte;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Verkaeufer [name=" + name + ", produkte=" + produkte + "]";
	}

	public List<Produkt> getProdukte() {
		return produkte;
	}

	public void setProdukte(List<Produkt> produkte) {
		this.produkte = produkte;
	}

	public Verkaeufer(String name, List<Produkt> produkte) {
		super();
		this.produkte = produkte;
	}

	public Verkaeufer(String name) {
		super();
		this.name = name;
	}

}
