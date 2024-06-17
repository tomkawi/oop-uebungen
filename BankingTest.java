package praktikum3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class BankingTest {

	public static void main(String[] args) {

		testUeberweisungenSortieren();
		testeBankUndKonto();

	}

	public static void testUeberweisungenSortieren() {

		Ueberweisung[] array = { new Ueberweisung(1, 99, 2, 99, 100, 4),
				  				 new Ueberweisung(2, 99, 3, 99, 50, 3), 
								 new Ueberweisung(3, 99, 4, 99, 60, 1),
								 new Ueberweisung(4, 99, 5, 99, 80, 5), 
								 new Ueberweisung(5, 99, 1, 99, 20, 2) };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].priorität());
		}

		System.out.println("--------------");

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].priorität());
		}

		System.out.println("--------------");

		PriorityQueue<Ueberweisung> ueberweisungen = new PriorityQueue<>();

		ueberweisungen.offer(array[4]);
		ueberweisungen.offer(array[2]);
		ueberweisungen.offer(array[0]);
		ueberweisungen.offer(array[1]);
		ueberweisungen.offer(array[3]);

		while (!ueberweisungen.isEmpty()) {
			for (int i = 0; i < array.length; i++) {
				Ueberweisung temp = ueberweisungen.poll();
				System.out.println(temp.priorität());

			}

		}
		System.out.println("--------------");
	}
	
	public static void testeBankUndKonto() {
		
		Bank[] banken = {new Bank(0,5), new Bank(1,3)};
		banken[0].getKonten()[0].einzahlen(100);
		banken[0].getKonten()[1].einzahlen(200);
		banken[0].getKonten()[2].einzahlen(300);
		banken[0].getKonten()[2].auszahlen(100);
		
		banken[1].getKonten()[0].einzahlen(999);
		banken[1].getKonten()[1].einzahlen( 50);
		banken[1].getKonten()[2].einzahlen(500);
		banken[1].getKonten()[2].auszahlen(400);
		
		System.out.println("Bank 0");
		System.out.println("BLZ: " + banken[0].getBlz());
		System.out.println("Gesamteinlage: " + banken[0].getGesamteinlage());
		System.out.println(Arrays.toString(banken[0].getKonten()));
		
		System.out.println("------------------");
		
		System.out.println("Bank 1");
		System.out.println("BLZ: " + banken[1].getBlz());
		System.out.println("Gesamteinlage: " + banken[1].getGesamteinlage());
		System.out.println(Arrays.toString(banken[1].getKonten()));
		
	}
	
	public static void testeUeberweisen() {
		
		Bank[] banken = {new Bank(0,5)};
		Transaktionsbroker broker = new Transaktionsbroker(banken);
		banken[0].setBroker(broker);
		
		Thread t = new Thread(broker);
		t.start();
	}
}