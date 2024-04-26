package aufgabe1_4;

public class Tischlampe {

	private int hoehe;
	protected double nennleistung = 50;
	public static final int EINGANGSSPANNUNG = 230;
	protected int dimmgrad;
	protected boolean eingeschaltet;
	
	public Tischlampe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	
	public void einschalten() {
		eingeschaltet = true;
	}
	
	public void ausschalten() {
		eingeschaltet = false;
	}
	
	public void dimmen(int dimmgrad) {
		this.dimmgrad = dimmgrad;		
	}
	
	public int getDimmgrad() {
		return dimmgrad;
	}
	
	void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	public int getHoehe() {
		return hoehe;
	}
	
	public boolean isEingeschaltet() {
		return eingeschaltet;
	}
		
	public double getNennleistung() {
		return nennleistung;
	}
	
	public void setNennleistung(double nennleistung) {
		this.nennleistung = nennleistung;
	}
	
	
}
