package praktikum2;

public class EinarmigerBandit {

	public static void main(String[] args) {

		for (int i = 2; i <= 8; i++) {
			int zähler = 0;
			for (int j = 0; j < 1000; j++) {
				if(zeichenSpeichern(i)) {
					zähler += 1;
				}
			}
			System.out.println(i + " ist: " + zähler/10.0 + "%");
		}
	}
	public static boolean zeichenSpeichern(int anzahl) {
		RandomChar walzen = new RandomChar();

		char walze1 = (char) walzen.nextInt( (char) 0, (char) (anzahl));
		char walze2 = (char) walzen.nextInt( (char) 0, (char) (anzahl));
		char walze3 = (char) walzen.nextInt( (char) 0, (char) (anzahl));

		if (walze1 == walze2 && walze2 == walze3) {
			return true;

		} else {
			return false;

		}
	}
}
