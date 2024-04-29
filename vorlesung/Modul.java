package vorlesung;

public class Modul {

	//Attribute
	private String name;
	private float punkteKlausur1;
	private float punkteKlausur2;
	private boolean praktikum;
	
	//Konstruktoren
	
	public Modul() {
		this("n.n.");
	}
	
	public Modul(String name) {
		this(name, 0.0F, 0.0F);
	}
	
	public Modul(String name, float punkteKlausur1, float punkteKlausur2) {
		this(name, punkteKlausur1, punkteKlausur2, false);
	}
	
	public Modul(String name, float punkteKlausur1, float punkteKlausur2, boolean praktikum) {
		this.name = name;
		this.punkteKlausur1 = punkteKlausur1;
		this.punkteKlausur2 = punkteKlausur2;
		this.praktikum = praktikum;
	}
	
	//Methoden
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPunkteKlausur1() {
		return punkteKlausur1;
	}
	
	public void setPunkteKlausur1(float punkteKlausur1) {
		this.punkteKlausur1 = punkteKlausur1;
	}
	
	public float getPunkteKlausur2() {
		return punkteKlausur2;
	}
	
	public void setPunkteKlausur2(float punkteKlausur2) {
		this.punkteKlausur2 = punkteKlausur2;
	}
	
	public void setPraktikum(boolean praktikum) {
		this.praktikum = praktikum;
	}
	
	public float getGesamtpunkte() {
		return (punkteKlausur1 + punkteKlausur2);
	}
	
	public boolean isAbgeschlossen() {
		return praktikum &&(getGesamtpunkte() / 2 >= 50);
	}
	
	
	
	
}
