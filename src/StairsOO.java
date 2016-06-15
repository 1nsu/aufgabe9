/**
 * 
 * @author Jan Kulose, s0557320@htw-berlin.de
 *
 */

public class StairsOO {
	private int steps,
				width;
	
	/**
	 * Creates a stairs object with a given step count and step width.
	 * @param steps Step count
	 * @param width Step width
	 */
	public StairsOO (int steps, int width) {
		this.steps = steps;
		this.width = width;
	}
	
	/**
	 * Draws the stairs object in the console output.
	 */
	public void drawStairsOO() {
		for (int i=1; i<=this.steps; i++) {
			for (int n=0; n<(i*this.width); n++) {
				System.out.print("* ");
			}
			System.out.println(i);
		}
	}
}
