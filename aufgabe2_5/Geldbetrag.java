package aufgabe2_5;

import java.util.Objects;

enum Waehrung{
	EUR, USD
}

public record Geldbetrag(long betrag, Waehrung waehrung) {
	public Geldbetrag {
		Objects.requireNonNull(waehrung);
	}

	public Geldbetrag(long betrag) {
		this(betrag, Waehrung.EUR);
	}

	public static Geldbetrag nullEuro() {
		return NULL_EURO;
	}

	public static Geldbetrag nullDollar() {
		return NULL_DOLLAR;
	}

	public static final Geldbetrag NULL_EURO = new Geldbetrag(0);
	public static final Geldbetrag NULL_DOLLAR = new Geldbetrag(0, Waehrung.USD);
}

