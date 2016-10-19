package sterling.spencer;

import java.util.Random;

public class MultiTool {
	public MultiTool() {
		
	}
	
	public int randInt(int rangeMin, int rangeMax) {
		Random r = new Random();
		return r.nextInt((rangeMax - rangeMin) + 1) + rangeMin;
	}
	
	public double randDouble(int rangeMin, int rangeMax) {
		Random r = new Random();
		return rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	}
}
