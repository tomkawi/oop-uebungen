package praktikum1;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Briefmarkenautomat {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Bitte geben Sie ihre Höhe ein:");
			String hoehe = scanner.nextLine();
			System.out.println("Bitte geben Sie ihr Gewicht ein:");
			String gewicht = scanner.nextLine();

			if (Integer.parseInt(hoehe) > 50 || Integer.parseInt(gewicht) > 1000) {
				System.out.println("Ihre Eingaben sind zu groß. Bitte erneut versuchen.");
				continue;
			} else {

				System.out.println("Ihr benötigtes Porto für eine/n "
						+ Sendungstyp.typ(Integer.parseInt(hoehe), Integer.parseInt(gewicht)).getBezeichnung()
						+ " beträgt " + Sendungstyp.typ(Integer.parseInt(hoehe), Integer.parseInt(gewicht)).getPorto()
						+ " Cent.");
				System.out.println("Wie viele Portos wollen Sie kaufen?");
				String anzahlPorto = scanner.nextLine();

				if (anzahlPorto.equals("a")) {
					System.out.println("Der Vorgang wurde abgebrochen.");
					continue;

				} else {
					int anzahl = Integer.parseInt(anzahlPorto);
					if (anzahl > 0 && anzahl <= 10) {
						int Gesamtportokosten = anzahl
								* Sendungstyp.typ(Integer.parseInt(hoehe), Integer.parseInt(gewicht)).getPorto();
						System.out.println("Ihre Portokosten betragen: " + Gesamtportokosten + " Cent.");
						System.out.println("Bitte Münzen einwerfen.");
						int wechselgeld = kassieren(Gesamtportokosten);

						if (wechselgeld < 0) {
							System.out.println("Rückgeld wird berechnet");
						}
						int[] rückgeld = wechselgeldBerechnen(wechselgeld);
						System.out.println("Ihr Wechselgeld beträgt: " + wechselgeld + " Cent.");
						for (int i = 0; i < rückgeld.length; i++) {
							int[] muenzen = { 200, 100, 50, 20, 10, 5 };
							if (rückgeld[i] > 0) {
								System.out.println("Dies entspricht: " + rückgeld[i] + " mal " + muenzen[i] + " Cent.");
							}

						}

					} else {
						System.out.println("Bitte eine Zahl zwischen 1 und 10 eingeben.");
						System.out.println("Wie viele Portos wollen Sie kaufen?");
						anzahlPorto = scanner.nextLine();
					}

				}

			}
		}
	}

	public static int[] wechselgeldBerechnen(int wechselgeld) {

		int[] rückgeld = new int[6];

		while (wechselgeld >= 200) {
			wechselgeld -= 200;
			rückgeld[0] += 1;
		}

		while (wechselgeld >= 100) {
			wechselgeld -= 100;
			rückgeld[1] += 1;
		}

		while (wechselgeld >= 50) {
			wechselgeld -= 50;
			rückgeld[2] += 1;
		}

		while (wechselgeld >= 20) {
			wechselgeld -= 20;
			rückgeld[3] += 1;
		}

		while (wechselgeld >= 10) {
			wechselgeld -= 10;
			rückgeld[4] += 1;
		}

		while (wechselgeld >= 5) {
			wechselgeld -= 5;
			rückgeld[5] += 1;
		}

		return rückgeld;
	}

	public static int kassieren(int betrag) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int muenzen = 0;
		int eingeworfen = 0;
		while (muenzen < betrag) {
			String input = reader.readLine();
			if (input.equals("200")) {
				eingeworfen++;
				muenzen += 200;
			} else if (input.equals("100")) {
				eingeworfen++;
				muenzen += 100;
			} else if (input.equals("50")) {
				eingeworfen++;
				muenzen += 50;
			} else if (input.equals("20")) {
				eingeworfen++;
				muenzen += 20;
			} else if (input.equals("10")) {
				eingeworfen++;
				muenzen += 10;
			} else if (input.equals("5")) {
				eingeworfen++;
				muenzen += 5;
			}
			if ((betrag - muenzen) > 0)
				System.out.println("Restbetrag: " + (betrag - muenzen));
			if (input.equals("a") && eingeworfen > 0) {
				return muenzen;
			}
		}
		System.out.println("Wechselgeld: " + (muenzen - betrag));
		return muenzen - betrag;
	}

}
