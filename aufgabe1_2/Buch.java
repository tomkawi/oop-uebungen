package aufgabe1_2;

public class Buch {

	// Attribute
	String titel;
	String autor;
	double preis;
	char währung;

	// Konstruktor
	public Buch(String titel, String autor, double preis, char währung) {
		this.titel = titel;
		this.autor = autor;
		this.preis = preis;
		this.währung = währung;
	}

	// set-Methoden
	public void setTitel(String titel) {
		this.titel = titel;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public void setWährung(char währung) {
		this.währung = währung;
	}

	// get-Methoden
	public String getTitel() {
		return titel;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreis() {
		return preis;
	}

	public char getWährung() {
		return währung;
	}

	public String info() {
		return this.autor + ": " + this.titel + " (" + this.preis + this.währung + ")";

	}
}
