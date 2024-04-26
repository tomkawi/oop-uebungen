package aufgabe0_2;

import java.util.Scanner;

public class Aufgabe02 {

	public static void main(String[] args) {	

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte Uhrzeit eingeben");
		int uhrzeit = scanner.nextInt();
		
		System.out.println("Bitte Temperatur eingeben");
		int temperatur = scanner.nextInt();
		
		ausgabe(uhrzeit,temperatur);
		scanner.close();
	}
	public static void ausgabe(int uhrzeit, int temperatur) {
		
		System.out.println(uhrzeit + "Uhr ist " + uhrzeitAmerika(uhrzeit));
		
		System.out.println(temperatur+"°C sind " + gradInFahrenheit(temperatur)+"°F");
		
	}
	public static int gradInFahrenheit(int temperatur) {
		
		int fahrenheit = (temperatur*9/5) + 32;
		return fahrenheit;
	}
	public static boolean vormittag(int uhrzeit) {
	
		if (uhrzeit <= 12) {
			boolean Vormittag = true;
			return Vormittag;
		} else {
			boolean Nachmittag = true;
			return Nachmittag;
		}
		
	}
	public static String uhrzeitAmerika(int uhrzeit) {
		String tageszeit = "";
		int uhrzeitNeu = 0;
		
		if (uhrzeit == 0000) {
			uhrzeitNeu = 1200;
			tageszeit = "am";
			
		} else if (uhrzeit < 1200) {
			uhrzeitNeu = uhrzeit;
			tageszeit = "am";
			
		} else if (uhrzeit == 1200){		
			uhrzeitNeu = 1200;
			tageszeit = "pm";
			
		}else {	
			uhrzeitNeu = uhrzeit - 1200;
			tageszeit = "pm";
		}
			
		String umwandlung = Integer.toString(uhrzeitNeu) + tageszeit;
		return umwandlung;
	}
	
}