package praktikum3;

public class Konto {

	int nummer;
	long saldo;
	
	public Konto(int nummer, long saldo) {
		this.nummer = nummer;
		this.saldo = saldo;
	}
	
	

	public int getNummer() {
		return nummer;
	}



	public void setNummer(int nummer) {
		this.nummer = nummer;
	}



	public long getSaldo() {
		return saldo;
	}



	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}



	public void einzahlen(long betrag){
		saldo += betrag;
	}
	
	public void auszahlen(long betrag){
		saldo -= betrag;
	}
	
	@Override
    public String toString() {
        return "Kontonummer: " + this.nummer + "| Saldo: " + this.saldo + "€";
    }
}
