import java.util.concurrent.PriorityBlockingQueue;

public class Transaktionsbroker implements Runnable {
    private final PriorityBlockingQueue<Ueberweisung> queue = new PriorityBlockingQueue<>();
    private final Bank[] banken;

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
        Ueberweisung ueberweisung;
        try {
            ueberweisung = queue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        banken[ueberweisung.zielKonto().getBlz()].fuehreUeberweisungAus(ueberweisung);
        banken[ueberweisung.quellKonto().getBlz()].fuehreUeberweisungAus(ueberweisung);
    }
}
