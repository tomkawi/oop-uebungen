package aufgabe2_2;

import aufgabe2_4.Kunde;

public class main2_2 {

	public static void main(String[] args) {
		
		Kunde kunde  = new Kunde("Mustermann", "Max");
		Konto konto1 = new Konto("1",1000f,kunde);
		Konto konto2 = new Konto("2",10000f,kunde);
		
		System.out.println(kunde.getVorname()+" "+kunde.getName());
		System.out.println(konto1.getNummer()+" "+konto1.getSaldo()+" "+konto1.getKunde().getName());
		System.out.println(konto2.getNummer()+" "+konto2.getSaldo()+" "+konto2.getKunde());
		
		for (int i = 0; i < kontos.length; i++) {
			kontos[i] = new Konto( Integer.toString(i+1),1000f);
		}
		
		kontos[1].überweisen(100f, kontos[2]);
		System.out.println(kontos[0].getNummer()+" "+kontos[0].getSaldo());
		System.out.println(kontos[1].getNummer()+" "+kontos[1].getSaldo());
		System.out.println(kontos[2].getNummer()+" "+kontos[2].getSaldo());
		System.out.println(kontos[3].getNummer()+" "+kontos[3].getSaldo());
		System.out.println(kontos[4].getNummer()+" "+kontos[4].getSaldo());

	}

}
