package aufgabe2_2;

public class Konto {

	//Attribute
	private String nummer;
	private float saldo;
	private int konten;
	
	//Konstruktor
	public Konto(String nummer, float saldo) {
		this.nummer = nummer;
		this.saldo = saldo;
		konten++;
	}
	
	//get-Methoden
	public String getNummer() {
		return nummer;
	}
	
	public float getSaldo(float saldo) {
		return saldo;
	}
	
	//set-Methoden
	void setNummer(String nummer) {
		this.nummer = nummer;
	}
	
	void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void einzahlen(float plus) {
		saldo += plus;
	}
	
	public void auszahlen(float minus) {
		saldo -= minus;
	}
	
	
}
