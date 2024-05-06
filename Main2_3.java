package aufgabe2_3;

public class Main2_3 {

	public static void main(String[] args) {
		
		Kreis kreis1 = new Kreis();
		
		Kreis kreis2 = new Kreis(2f, 4f, 10f, "grün");
		
		Kreis kreis3 = new Kreis(1f, 3f, 5f);
		
		System.out.println(kreis1.getMittelpunktX() +" "+ kreis1.getMittelpunktY() +" "+ kreis1.getRadius() +" "+ kreis1.getFarbe());
		System.out.println(kreis2.getMittelpunktX() +" "+ kreis2.getMittelpunktY() +" "+ kreis2.getRadius() +" "+ kreis2.getFarbe() ) ;
		System.out.println(kreis3.getMittelpunktX() +" "+ kreis3.getMittelpunktY() +" "+ kreis3.getRadius() +" "+ kreis3.getFarbe() ) ;

	}

}
