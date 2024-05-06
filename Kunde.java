package aufgabe2_4;

public class Kunde {

	String name;
	String vorname;
	
	public Kunde(String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	
}
