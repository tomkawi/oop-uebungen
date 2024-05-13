package aufgabe3_2;

public class Student extends Mensch {

	String matrikelnummer;	
	
	public Student(int alter, char geschlecht, String name, String matrikelnummer) {
		super(alter, geschlecht, name);
		this.matrikelnummer = matrikelnummer;
	}
	
	public String getMatrikelnummmer() {
		return matrikelnummer;
	}
	
	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	
	public String getTyp() {
		return "Student";
	}
	
	public void ausgabe() {
		System.out.println("Name des Studierenden: " + name);
		System.out.println("Alter des Studierenden: " + alter);
		System.out.println("Geschlecht des Studierenden: " + geschlecht);
		System.out.println("Matriklenummer des Studierenden: " + matrikelnummer);

	}
}
