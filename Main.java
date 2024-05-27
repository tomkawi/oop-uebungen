package praktikum2;
import java.util.Random;

public class Main {

	static Random random1 = new Random();
	static Random random2 = new Random((long)659417494);
	
	public static void main(String[] args) {

		randomNumber(random1);
		randomNumber(random2);
	}

	public static void randomNumber(Random random) {
		
		// Random Zahl zwischen 0 und 100
		for (int i = 0; i < 20; i++) {
			System.out.println(random.nextInt(101));
		}
		System.out.println("---");
		
		// Random Zahl zwischen 32 und 126
		for (int i = 0; i < 20; i++) {
			System.out.println(random.nextInt(95)+32);
		}
		System.out.println("---");	

	}
}
