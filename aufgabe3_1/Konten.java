package aufgabe3_1;

class Konten {
	
	//Attribute
	private final String kontonummer; //final????
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
	void einzahlen(long betragPlus) {
		saldo += betragPlus;
	}
	
	void auszahlen(long betragMinus) {
		saldo -= betragMinus;
	}
	
	
}
