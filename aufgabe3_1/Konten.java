package aufgabe3_1;

class Konten {
	
	//Attribute
	private String kontonummer; //final????
	protected long saldo;

	public Konten(String kontonummer, long saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}

	

		
	//get-Methoden
	public String getKontonummer() {
		return kontonummer;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	//Methoden
	void einzahlen(double betragPlus) {
		saldo += betragPlus;
	}
	
	void auszahlen(double betragMinus) {
		saldo -= betragMinus;
	}
	
	
}
