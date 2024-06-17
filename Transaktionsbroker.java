package praktikum3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * 
 * @author Christian Weidauer, HS Bochum
 * Unterstuetzungsklasse zu Praktikumsversuch
 *
 */
public class Transaktionsbroker implements Runnable {
	private Queue<Ueberweisung> queue = new PriorityQueue<>(); // new PriorityBlockingQueue<>();
	private Bank[] banken;

	public Transaktionsbroker(Bank[] banken) {
		this.banken = banken;
	}

	public void leiteUeberweisungWeiter(Ueberweisung ueberweisung) {
		queue.offer(ueberweisung);
	}

	public Bank[] getBanken() {
		return banken;
	}
	
	@Override
	public void run() {
		long zeitLetzteUeberweisung = System.currentTimeMillis();
		do {
			// Alternative: 
			// Ueberweisung ueberweisung = queue.poll();
			// if (ueberweisung != null) {

			if (!queue.isEmpty()) {
				Ueberweisung ueberweisung = queue.poll();
				banken[ueberweisung.getBlzZiel()].fuehreUeberweisungAus(ueberweisung);
				zeitLetzteUeberweisung = System.currentTimeMillis();
			}
		} while (System.currentTimeMillis() - zeitLetzteUeberweisung < 1000);
	}

}