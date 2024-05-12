package aufgabe2_5;

public class Main2_5 {

	public static void main(String[] args) {
		
		System.out.println(Geldbetrag.NULL_DOLLAR.betrag() + " " + Geldbetrag.NULL_DOLLAR.waehrung());
		Geldbetrag zehnEuro = new Geldbetrag(10, Waehrung.EUR);
		System.out.println(zehnEuro.betrag() + " " + zehnEuro.waehrung());

		System.out.println(new Geldbetrag(10, Waehrung.EUR).equals(new Geldbetrag(10, Waehrung.USD)));
		System.out.println(new Geldbetrag(10, Waehrung.EUR).equals(new Geldbetrag(10, Waehrung.EUR)));

		System.out.println(Geldbetrag.NULL_DOLLAR.equals(Geldbetrag.NULL_EURO));
		System.out.println(Geldbetrag.nullDollar().equals(new Geldbetrag(0, Waehrung.USD)));	
	}

}
