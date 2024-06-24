import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class BankingTest {
    public static void main(String[] args) throws InterruptedException {
        //testUeberweisungenSortieren();
        //testeBankUndKonto();
        testeUeberweisungen();
    }
    /*public static void testUeberweisungenSortieren() {
        Ueberweisung[] array = {
                new Ueberweisung(0, 1, 10, 3),
                new Ueberweisung(0, 1, 10, 2),
                new Ueberweisung(1, 0, 10, 1),
                new Ueberweisung(1, 0, 10, 4),
                new Ueberweisung(1, 1, 10, 5),
        };
        System.out.println("Vorher: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Nachher: " + Arrays.toString(array));
        Queue<Ueberweisung> ueberweisungen = new PriorityQueue<>();
        ueberweisungen.offer(array[3]);
        ueberweisungen.offer(array[0]);
        ueberweisungen.offer(array[4]);
        ueberweisungen.offer(array[2]);
        ueberweisungen.offer(array[1]);
        while (!ueberweisungen.isEmpty()) {
            System.out.println(ueberweisungen.poll());
        }
    }*/

    public static void testeBankUndKonto() {
        Bank[] banken = { new Bank(0, 5), new Bank(1, 3)};
        for (Bank bank: banken) {
            for (Konto konto: bank.getKonten()) {
                konto.einzahlen(100);
                konto.auszahlen(40);
                konto.einzahlen(120);
            }
            System.out.println("BLZ: " + bank.getBlz() + ", Gesamteinlage: " + bank.getGesamteinlage());
            System.out.println("Kontodaten: " + Arrays.toString(bank.getKonten()));
        }
    }

    public static void testeUeberweisungen() throws InterruptedException {
        Bank[] banken = { new Bank(0, 5) };
        Ueberweisung ueberweisung1 = new Ueberweisung(banken[0].getKonten()[0], banken[0].getKonten()[1], 100, 3);
        Ueberweisung ueberweisung2 = new Ueberweisung(banken[0].getKonten()[2], banken[0].getKonten()[1], 15, 1);
        Ueberweisung ueberweisung3 = new Ueberweisung(banken[0].getKonten()[3], banken[0].getKonten()[4], 200, 5);
        banken[0].fuehreUeberweisungAus(ueberweisung1);
        banken[0].fuehreUeberweisungAus(ueberweisung2);
        banken[0].fuehreUeberweisungAus(ueberweisung3);
        System.out.println("Vorher");
        System.out.println("Gesamteinlagen: " + banken[0].getGesamteinlage() + "€");
        System.out.println("Kontodaten: " + Arrays.toString(banken[0].getKonten()));
        Transaktionsbroker broker = new Transaktionsbroker(banken);
        Thread thread = new Thread(broker);
        thread.start();
        broker.leiteUeberweisungWeiter(ueberweisung1);
        broker.leiteUeberweisungWeiter(ueberweisung2);
        broker.leiteUeberweisungWeiter(ueberweisung3);
        thread.join();
        System.out.println("Nachher");
        System.out.println("Gesamteinlagen: " + banken[0].getGesamteinlage() + "€");
        System.out.println("Kontodaten: " + Arrays.toString(banken[0].getKonten()));
    }
}
