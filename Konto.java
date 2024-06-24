public class Konto {
    private final int nr;
    private long saldo;
    private final int blz;

    public Konto(int nr, long saldo, int blz) {
        this.nr = nr;
        this.saldo = saldo;
        this.blz = blz;
    }

    public synchronized void einzahlen(long betrag) {
        synchronized (this) {
            this.saldo += betrag;
        }
    }

    public synchronized void auszahlen(long betrag) throws IllegalArgumentException {
        this.saldo -= betrag;
    }

    @Override
    public String toString() {
        return "Kontonummer: " + this.nr + ", Saldo: " + this.saldo + "€";
    }

    public int getNr() {
        return nr;
    }

    public long getSaldo() {
        return saldo;
    }

    public int getBlz() {
        return blz;
    }
}
