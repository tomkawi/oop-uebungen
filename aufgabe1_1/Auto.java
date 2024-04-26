package aufgabe1_1;

public class Auto {

	String marke;
	String modell;
	int ps;
	private static int anzahl;

	public Auto(String marke, String modell, int ps) {
		this.marke = marke;
		this.modell = modell;
		this.ps = ps;
		anzahl++;
	}
	
	//set-Methoden
	public void setMarke(String marke) {
		this.marke = marke;
	}
	
	public void setModell(String modell) {
		this.modell = modell;
	}
	
	public void setPs(int ps) {
		this.ps = ps;
	}
	
	//get-Methoden
	public String getMarke() {
		return marke;
	}
	
	public String getModell() {
		return modell;
	}

	public int getPs() {
		return ps;
	}
	
	public String getTyp() {
		return "Auto";
	}
	
	public static int getAnzahl() {
		return anzahl;
	}
}
