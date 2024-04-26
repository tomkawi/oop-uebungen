package aufgabe1_2;

public class Main1_2 {

	public static void main(String[] args) {
		
		Buch buch1 = new Buch("Harry Potter","J.K.Rowling",19.99,'€');
		System.out.println(buch1.titel+" von "+buch1.autor+" kostet "+buch1.preis+buch1.währung);
				
		Buch buch2 = new Buch("Der Herr der Ringe","J.R.R.Tolkien",29.99,'€');
		System.out.println(buch2.titel+" von "+buch2.autor+" kostet "+buch2.preis+buch2.währung);
		
	}

}
