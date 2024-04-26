package aufgabe1_3;

public class Uhrzeit {

	//Attribute
	int stunden;
	int minuten;
	String tageszeitindikator;
	public static final String AM = "am";
	public static final String PM = "pm";
	
	//Konstruktor
	public Uhrzeit(int stunden, int minuten, String tageszeitindikator) {
		this.stunden = stunden;
		this.minuten = minuten;
		setTageszeitindikator(tageszeitindikator);		
	}
	
	//set-Methoden
	public void setStunden(int stunden) {
		this.stunden = stunden;		
	}
	
	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}
	
	public void setTageszeitindikator(String tageszeitindikator)  {
		this.tageszeitindikator = tageszeitindikator;
	}
	
	//get-Methoden
	public int getStunden() {
		return stunden;
	}
	
	public int getMinuten() {
		return minuten;
	}
	
	public String getTageszeitindikator() {
		return tageszeitindikator;
	}
	
	//Methode zur Umrechnung
	public String umrechnungUhrzeit() {
		
		if (tageszeitindikator == "pm") {
			stunden = stunden+12;
			return stunden+":"+minuten;
		}else {
			return stunden+":"+minuten;
		}
	}
}
