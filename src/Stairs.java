/**
 * 
 * @author Jan Kulose, s0557320@htw-berlin.de
 *
 */

public class Stairs {
	/**
	 * Draws the stairs.
	 */
	static void drawStairs() {
		for (int i=1; i<=10; i++) {
			for (int n=0; n<(i*3); n++) {
				System.out.print("* ");
			}
			System.out.println(i);
		}
	}
}
