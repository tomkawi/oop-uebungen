package aufgabe2_1;

public class Main2_1 {

	public static void main(String[] args) {
		
		Rechteck r1 = new Rechteck(3.5f,   9f);
		Rechteck r2 = new Rechteck(5.5f, 5.5f);
		Rechteck r3 = new Rechteck(r1);
		
		System.out.println(r1.getSeiteA() + " * " + r1.getSeiteB() + " = " +r1.flächeninhalt() + " Quadrat?: "+ r1.isQuadrat());
		System.out.println(r2.getSeiteA() + " * " + r2.getSeiteB() + " = " +r2.flächeninhalt() + " Quadrat?: "+ r2.isQuadrat());
		System.out.println(r3.getSeiteA() + " * " + r3.getSeiteB() + " = " +r3.flächeninhalt() + " Quadrat?: "+ r3.isQuadrat());
	}

}
