package praktikum1_1;

import java.util.Scanner;

public class Briefmarkenautomat {

	public static void main(String[] args) {
		
		int portoKosten;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie ihre Höhe ein:");
		String hoehe = scanner.nextLine();
		System.out.println("Bitte geben Sie ihr Gewicht ein:");
		String gewicht = scanner.nextLine();
		
		System.out.println("Ihr benötigtes Porto für eine/n "+Sendungstyp.typ(Integer.parseInt(hoehe),Integer.parseInt(gewicht)).getBezeichnung()+" beträgt "+Sendungstyp.typ(Integer.parseInt(hoehe),Integer.parseInt(gewicht)).getPorto()+" Cent.");
		System.out.println("Wie viele Portos wollen Sie kaufen?");
		String anzahlPorto = scanner.nextLine();
		
		if (anzahlPorto.equals(Integer.parseInt("a"))) {
			System.out.println("Ihr Bezahlvorgang wurde abgebrochen");
						
		} else {
			System.out.println("Ihre Portokosten betragen: " + Integer.parseInt(anzahlPorto) * Sendungstyp.typ(Integer.parseInt(hoehe),Integer.parseInt(gewicht)).getPorto() + " Cent.");
		}		
		
		
	}
	
	
	
	
	
	public static int[] wechselgeldBerechnen(int wechselgeld) {
		
		int[] rückgeld = new int[6]; 
		
		while(wechselgeld >= 200) {
			wechselgeld -= 200;
			rückgeld[0] += 1;
		}
		
		while(wechselgeld >= 100) {
			wechselgeld -= 100;
			rückgeld[1] += 1;
		}
		
		while(wechselgeld >= 50) {
			wechselgeld -= 50;
			rückgeld[2] += 1;
		}
		
		while(wechselgeld >= 20) {
			wechselgeld -= 20;
			rückgeld[3] += 1;
		}
		
		while(wechselgeld >= 10) {
			wechselgeld -= 10;
			rückgeld[4] += 1;
		}
		
		while(wechselgeld >= 5) {
			wechselgeld -= 5;
			rückgeld[5] += 1;
		}
			
		return rückgeld;
	}
	
	public static int kassieren(int betrag) {	
		Scanner scanner = new Scanner(System.in);
		int muenzen = 0;
		
		while ((betrag - muenzen) > 0) {
			System.out.println("Restbetrag: "+ (betrag - muenzen) + " Cent");
			String eingabe = scanner.nextLine();
			
			if (eingabe.equals("a")) {
				System.out.println("Ihr Bezahlvorgang wurde abgebrochen");
				return -muenzen;				
			} else {
				int eingabeInt = Integer.parseInt(eingabe);
				muenzen += eingabeInt;
			}		
		}
		scanner.close();
		
		return muenzen-betrag;
		
	}
	
	
	
	
}
