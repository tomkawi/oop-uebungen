package aufgabe2_1;

public class Rechteck {
	
	//Attribute
	private float seiteA;
	private float seiteB;
	
	//Konstruktor
	public Rechteck(float seiteA, float seiteB) {
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}
	
	public Rechteck(Rechteck kopie) {
		this.seiteA = kopie.seiteA;
		this.seiteB = kopie.seiteB;
	}
	
	//get-Methoden
	public float getSeiteA() {
		return seiteA;
	}
	
	public float getSeiteB() {
		return seiteB;
	}
	
	//set-Methoden
	void setSeiteA(float seiteA) {
		this.seiteA = seiteA;
	}
	
	void setSeiteB(float seiteB) {
		this.seiteB = seiteB;
	}
	
	public boolean isQuadrat() {
			return seiteA == seiteB;
	}
	
	public float flächeninhalt() {
		return seiteA * seiteB;
	}
	
}
