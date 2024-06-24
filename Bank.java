import java.util.Random;

public class Bank implements Runnable {
    private final int blz;
    private final Konto[] konten;
    private Transaktionsbroker broker;
    private final int anzahlSollUeberweisungen;

    public Bank(int blz, int kontenZahl) {
        this(blz, kontenZahl, 0);
    }

    public Bank(int blz, int kontenZahl, int anzahlSollUeberweisungen) {
        this.blz = blz;
        this.konten = new Konto[kontenZahl];
        this.anzahlSollUeberweisungen = anzahlSollUeberweisungen;
        for (int i = 0; i < this.konten.length; i++) {
            this.konten[i] = new Konto(i, 0, blz);
        }
    }

    public int getBlz() {
        return this.blz;
    }

    public Konto[] getKonten() {
        return this.konten;
    }

    public long getGesamteinlage() {
        long alleSalden = 0;
        for (Konto konto : this.konten) {
            alleSalden += konto.getSaldo();
        }
        return alleSalden;
    }

    public void setBroker(Transaktionsbroker broker) {
        this.broker = broker;
    }

    public synchronized void fuehreUeberweisungAus(Ueberweisung ueberweisung) {
        if (ueberweisung.zielKonto().getBlz() == this.blz) {
            this.konten[ueberweisung.zielKonto().getNr()].einzahlen(ueberweisung.betrag());
        }
        if (ueberweisung.quellKonto().getBlz() == this.blz) {
            this.konten[ueberweisung.quellKonto().getNr()].auszahlen(ueberweisung.betrag());
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        Ueberweisung[] ueberweisungen = new Ueberweisung[this.anzahlSollUeberweisungen];
        for (int i = 0; i < this.anzahlSollUeberweisungen; i++) {
            int quellKonto = random.nextInt(0, this.getKonten().length);
            int zielKonto = random.nextInt(0, this.getKonten().length);
            ueberweisungen[i] = new Ueberweisung(
                    new Konto(quellKonto, random.nextInt(1, 1000), random.nextInt(0, 3)),
                    new Konto(zielKonto, random.nextInt(1, 1000), random.nextInt(0, 3)),
                    random.nextInt(1, 1000),
                    random.nextInt(0, 5)
            );
        }
        for (Ueberweisung ueberweisung : ueberweisungen) {
            //System.out.println("Bank " + this.blz + " leitet Überweisung weiter: " + ueberweisung.quellKonto().getNr() + " -> " + ueberweisung.zielKonto().getNr() + ": " + ueberweisung.betrag());
            broker.leiteUeberweisungWeiter(ueberweisung);
        }
    }
}
