package praktikum3;

public class Bank {

	int blz;
	Transaktionsbroker broker;
	Konto[] konten;

	public Bank(int blz, int anzahl) {
		this.blz = blz;
		konten = new Konto[anzahl];
			for (int i = 0; i < anzahl; i++) {
				konten[i] = new Konto(i,0);
			}
	}

	public int getBlz() {
		return blz;
	}

	public Konto[] getKonten() {
		return konten;
	}
	
	public void setBroker(Transaktionsbroker broker) {
		this.broker = broker;
	}
	
	public long getGesamteinlage() {
		long gesamteinlage = 0;
		for (int i = 0; i < konten.length; i++) {
			gesamteinlage += konten[i].saldo;
		}
 
		return gesamteinlage;
	}
	
	public void fuehreUeberweisungAus(Ueberweisung temp) {
		konten[temp.zielkontoNummer()].einzahlen(temp.betrag());
	}

	public void ueberweisungErstellen(Ueberweisung temp) {
		konten[temp.quellkontoNummer()].auszahlen(temp.betrag());
		broker.leiteUeberweisungWeiter(temp);
		}
}
