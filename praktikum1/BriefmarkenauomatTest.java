package praktikum1;

public class BriefmarkenauomatTest {

	public static void main(String[] args) {
		
		
		
		// testeSendungstyp(30,30);
		// testeWechselgeldBerechnen(175);
		// System.out.println("Wechselgeld: "+Briefmarkenautomat.kassieren(180)+ " Cent");
		
	}

	public static void testeSendungstyp(int hoehe, int gewicht) {
		
		Sendungstyp test = Sendungstyp.typ(hoehe, gewicht);
		
		System.out.println(test.getBezeichnung()); // Bezeichnung
		System.out.println(test.getPorto()); // Porto
	}
	
	public static void testeWechselgeldBerechnen(int wechselgeld) {
		int[] test1 = Briefmarkenautomat.wechselgeldBerechnen(wechselgeld);
		
		for (int i = 0; i < test1.length; i++) {
			System.out.println(test1[i]);
			
		}
	}
	
}
