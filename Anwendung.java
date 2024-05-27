package praktikum2;

import java.util.Random;

public class Anwendung {

	public static void main(String[] args) {

		RandomChar random = new RandomChar(12);
		
		int zeichenkette = random.nextChar((char) 15, (char) 20);
		int zeichenkette2 = random.nextChar((char) 8, (char) 12);

		for (int i = 0; i < zeichenkette; i++) {
			System.out.print(random.nextChar());
		}
		System.out.println();

		for (int i = 0; i < zeichenkette2; i++) {
			System.out.print(random.nextChar('A', 'Z'));
		}
		System.out.println();

	}

}
