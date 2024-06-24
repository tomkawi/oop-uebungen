public record Ueberweisung(Konto quellKonto, Konto zielKonto, int betrag, int prio) implements Comparable<Ueberweisung> {
    @Override
    public int compareTo(Ueberweisung ueberweisung) {
        return Integer.compare(this.prio, ueberweisung.prio);
    }
}
