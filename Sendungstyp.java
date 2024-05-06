package praktikum1_1;

public class Sendungstyp {

	//Attribute
	private int maxHoehe; 		// in Millimeter
	private int maxGewicht;		// in Gramm
	private int porto;			// in Cent
	private String bezeichnung;
	private static Sendungstyp[] Sendungstypen = {	new Sendungstyp(0,2147483647,70,"Postkarte"),
													new Sendungstyp(5,20,85,"Standardbrief"),
													new Sendungstyp(10,50,100,"Kompaktbrief"),
													new Sendungstyp(20,500,160,"Großbrief"),
													new Sendungstyp(50,1000,275,"Maxibrief")}; 
	
	//Konstruktor
	private Sendungstyp(int maxHoehe, int maxGewicht, int porto, String bezeichnung) {
		this.maxHoehe = maxHoehe;
		this.maxGewicht = maxGewicht;
		this.porto= porto;
		this.bezeichnung = bezeichnung;
	}
	
	//Get-Methoden
	public int getMaxHoehe() {
		return maxHoehe;
	}
	
	public int getMaxGewicht() {
		return maxGewicht;
	}
	
	public int getPorto() {
		return porto;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	//Methode
	public static Sendungstyp typ(int hoehe, int gewicht) {
		
		for(int i = 0; i < Sendungstypen.length; i++) {
			
			if(Sendungstypen[i].getMaxHoehe() >= hoehe && Sendungstypen[i].getMaxGewicht() >= gewicht) {
				return Sendungstypen[i];	
			}
		}
		return null;				
	}
}