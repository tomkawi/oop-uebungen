package vorlesung;

public class Modulapp {

	public static void main(String[] args) {
		
		Modul modul1, modul2;
		modul1 = new Modul("Physik", 22.0f, 52.5f, true);
		modul2 = new Modul("Informatik");
		modul2.setPunkteKlausur1(73.5f);
		modul2.setPunkteKlausur2(49.0f);

		System.out.println("Die Gesamtpunkte von " + modul1.getName() + " sind: " + modul1.getGesamtpunkte() + "\nDie Gesamtpunkte von " + modul2.getName() + " sind: " + modul2.getGesamtpunkte() + ".");

		if (modul1.isAbgeschlossen())
			System.out.println("Das Modul " + modul1.getName() + " ist abgeschlossen!");
		if (modul2.isAbgeschlossen())
			System.out.println("Das Modul " + modul2.getName() + " ist abgeschlossen!");

	}

}
