package aufgabe0_3;

public class Aufgabe03 {

	public static void main(String[] args) {
		
		String[][]array= new String[3][32];
		
		for (int i = 0; i < array.length; i++) {			
			
			for (int j = 0; j < array[i].length; j++) {
				
				int zahl = 32 + j + i * 32;
				
				// | unicode dezimal oktal hexadezimal |
				String temp = "| '" + (char)zahl + "' " + zahl + " " + Integer.toOctalString(zahl) + " " + Integer.toHexString(zahl) + " |";
				array[i][j] = temp;
				
				
				System.out.println(array[i][j]);
			}
			
		}
	}	
}
