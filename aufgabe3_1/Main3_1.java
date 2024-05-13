package aufgabe3_1;

public class Main3_1 {

	public static void main(String[] args) {
		
		Girokonten Girokonto1 = new Girokonten("Girokonto 1",1000);
		Girokonten Girokonto2 = new Girokonten("Girokonto 2",1000);
		Girokonto1.auszahlen(1001);
		
		Sparkonten Sparkonto1 = new Sparkonten("Sparkonto 1", 1000);
		Sparkonten Sparkonto2 = new Sparkonten("Sparkonto 2", -1000);
		Sparkonto1.auszahlen(1001);
		
		System.out.println(Girokonto1.getKontonummer() + " " + Girokonto1.getSaldo() + "€");
		System.out.println(Sparkonto1.getKontonummer() + " " + Sparkonto1.getSaldo() + "€");
		System.out.println(Sparkonto2.getKontonummer() + " " + Sparkonto2.getSaldo() + "€");

	}

}
