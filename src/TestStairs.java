/**
 * Aufgabe 9.3 Treppe
 * @author Jan Kulose, s0557320@htw-berlin.de
 * 
 */

public class TestStairs {
	public static void main(String[] args) {
		StairsOO t1 = new StairsOO(5, 3);
		
		// drawing the test stairs object
		t1.drawStairsOO();
		System.out.println();
		
		// drawing with the static method
		Stairs.drawStairs();
	}
}
