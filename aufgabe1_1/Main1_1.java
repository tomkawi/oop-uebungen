package aufgabe1_1;

public class Main1_1 {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto("Porsche", "Cayenne", 200);
		System.out.println(auto1.marke+" "+auto1.modell+" "+auto1.ps+"PS");
		
		Auto auto2 = new Auto("Ford","Mustang",150);
		System.out.println(auto2.marke+" "+auto2.modell+" "+auto2.ps+"PS");
		System.out.println("Autoanzahl: " + Auto.getAnzahl());
		System.out.println(auto1.getTyp());
	}

}
