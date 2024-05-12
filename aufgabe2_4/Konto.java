package aufgabe2_4;

public class Konto {

	//Attribute
	private String nummer;
	private float saldo;
	private int konten;
	private Kunde kunde;
		
	//Konstruktor
	public Konto(String nummer, float saldo, Kunde kunde) {
		this.nummer = nummer;
		this.saldo = saldo;
		this.kunde = kunde;
		konten++;
	}
	
	//get-Methoden
	public String getNummer() {
		return nummer;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public Kunde getKunde() {
		return kunde;
	}
	
	//set-Methoden
	void setNummer(String nummer) {
		this.nummer = nummer;
	}
	
	void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	void getKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	
	public void einzahlen(float plus) {
		saldo += plus;
	}
	
	public void auszahlen(float minus) {
		saldo -= minus;
	}
	
	public void überweisen(float überweisungsbetrag, Konto empfänger) {
		auszahlen(überweisungsbetrag);
		empfänger.einzahlen(überweisungsbetrag);
	}
}
