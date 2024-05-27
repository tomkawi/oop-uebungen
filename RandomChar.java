package praktikum2;

public class RandomChar extends java.util.Random{

	public char start;
	public char ende;
	
	// Konstruktoren
	public RandomChar(char start, char ende) {
		super();
		this.start = start;
		this.ende = ende;
	}
	
	public RandomChar() {
		this((char) 32, (char) 126);
	}
	
	public RandomChar(char start, char ende, long seed) {
		this(start,ende);
		setSeed(seed);
	}
	
	public RandomChar(long seed) {
		this((char) 32, (char) 126, seed);
	}	
	
	
	// Methoden
	public char nextChar() {

		return nextChar(start, ende);
	}
	
	public char nextChar(char start, char ende) {

		return (char) (nextInt(ende - start + 1) + (start));
	}
	
	
	
}
