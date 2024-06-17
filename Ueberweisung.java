package praktikum3;

record Ueberweisung(int quellkontoNummer, int quellkontoBLZ, int zielkontoNummer, int zielkontoBLZ,
		int betrag, int priorität) implements java.lang.Comparable <Ueberweisung>{
	
	public Ueberweisung(int quellkontoNummer, int quellkontoBLZ, int zielkontoNummer, int zielkontoBLZ,
			int betrag, int priorität) {
		this.quellkontoNummer = quellkontoNummer;
		this.quellkontoBLZ = quellkontoBLZ;
		this.zielkontoNummer = zielkontoNummer;
		this.zielkontoBLZ = zielkontoBLZ;
		this.betrag = betrag;
		this.priorität = priorität;
	}

	public int compareTo(Ueberweisung o) {
		int prio1 = priorität;
		int prio2 = o.priorität;
		if (prio1 < prio2) {
			return 1;
		} else if (prio2 < prio1) {
			return -1;
		} else {
			return 0;
		}
	}

}
