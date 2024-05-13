package aufgabe3_1;

class Sparkonten extends Konten {

	public Sparkonten(String kontonummer, long saldo) {
		super(kontonummer, saldo);
	}

	
	@Override
	public void auszahlen(long betrag) {
		if (this.getSaldo() - betrag  >= 0) {
			saldo -= betrag;
		} else {
			System.out.println("Das Guthaben ihres Kontos reicht nicht zur Auszahlung.");
		}
	}
	
}
