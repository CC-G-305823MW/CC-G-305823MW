package UMLBestellung;

public class Kunde {

	protected int id;

	protected String name;

	protected String email;

	protected String adresse;

	public Kunde(int id, String name, String email, String adresse) {
		super();
		this.id = id; // Kunden ID steigt nicht an. Zählerschleife für jeden neuen Kunden aber wie?!
		this.name = name;
		this.email = email;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "KundenID:\t" + id + "\nName:\t\t" + name + "\nEmail:\t\t" + email + "\nAdresse:\t" + adresse + "\n";
	}

}
