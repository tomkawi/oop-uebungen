package aufgabe2_3;

public class Kreis {

	//Attribute
	private float mittelpunktX;
	private float mittelpunktY;
	private float radius;
	private String farbe;
	
	//Konstruktoren
	public Kreis(float mittelpunktX, float mittelpunktY, float radius, String farbe) {
		this.mittelpunktX = mittelpunktX;
		this.mittelpunktY = mittelpunktY;
		this.radius = radius;
		this.farbe = farbe;
	}
	
	public Kreis(float mittelpunktX, float mittelpunktY, float radius) {
		this(mittelpunktX, mittelpunktY, radius, "keine Farbe");
	}
	
	public Kreis() {
		this(0f,0f,0f);
	}
	
	//Methoden
	public float getMittelpunktX() {
		return mittelpunktX;
	}
	
	public void setMittelpunktX(float mittelpunktX) {
		this.mittelpunktX = mittelpunktX;
	}
	
	public float getMittelpunktY() {
		return mittelpunktY;
	}
	
	public void setMittelpunktY(float mittelpunktY) {
		this.mittelpunktY = mittelpunktY;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
}
