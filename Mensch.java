package aufgabe3_2;

public class Mensch {

	protected int alter;
	protected char geschlecht;
	protected String name;
	
	public Mensch(int alter, char geschlecht, String name) {
		this.alter = alter;
		this.geschlecht = geschlecht;
		this.name = name;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public char getGeschlecht() {
		return geschlecht;
	}
	
	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTyp() {
		return "Mensch";
	}

}
