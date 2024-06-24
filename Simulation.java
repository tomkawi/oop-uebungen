public class Simulation {

	public static void main(String[] args) throws InterruptedException {
		//Konstruktor: Bank(blz, kontenanzahl, ueberweisungsanahl)
		Bank[] banken = { new Bank(0, 1, 100), new Bank(1, 1, 100), new Bank(2, 1, 100) };
		saldenAusgeben("Salden aller Banken vorher: ", banken);

		Transaktionsbroker broker = new Transaktionsbroker(banken);
        Thread[] threads = new Thread[banken.length+1];
        threads[0] = new Thread(broker);
		threads[0].start();
        int i = 1;
        for (Bank bank: banken) {
            bank.setBroker(broker);
            threads[i] = new Thread(bank);
			threads[i].start();
            i++;
        }
		System.out.println("Warte auf Threads…");
        for (Thread thread: threads) {
            thread.join();
        }
		saldenAusgeben("Salden aller Banken nachher: ", banken);
	}

	private static void saldenAusgeben(String info, Bank[] banken) {
		System.out.println(info);
		long einlagensumme = 0;
		for (Bank bank : banken) {
			long gesamteinlage = bank.getGesamteinlage();
			einlagensumme += gesamteinlage;
			System.out.printf("BLZ: %d Saldo: %+7d%n", bank.getBlz(), gesamteinlage);
		}
		System.out.printf("Gesamteinlage: %d%n%n", einlagensumme);
	}
}
