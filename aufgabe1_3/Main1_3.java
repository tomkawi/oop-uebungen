package aufgabe1_3;

public class Main1_3 {

	public static void main(String[] args) {

		Uhrzeit u1 = new Uhrzeit(9,25,"am");
		System.out.println(u1.getStunden()+":"+u1.getMinuten()+u1.getTageszeitindikator()+" ist umgerechnet "+u1.umrechnungUhrzeit()+" Uhr.");
		
		Uhrzeit u2 = new Uhrzeit(9,13,"pm");
		System.out.println(u2.getStunden()+":"+u2.getMinuten()+u2.getTageszeitindikator()+" ist umgerechnet "+u2.umrechnungUhrzeit()+" Uhr.");
		
		Uhrzeit u3 = new Uhrzeit(12,10,"am");
		System.out.println(u3.getStunden()+":"+u3.getMinuten()+u3.getTageszeitindikator()+" ist umgerechnet "+u3.umrechnungUhrzeit()+" Uhr.");
		
	}

}
