
public class Equestria {

	public static void main (String[] args) {
		System.out.println("Distance from Baltimare to Manehattan = " + distance (4, -6));
		System.out.println("Distance from Los Pegasus to Neighagra Falls = " + distance (18, -13));
		System.out.println("Distance from Badlands to Ponyville = " + distance (-12, -9));
				
	}
	// sqrt((x2 - x1)sq + (y2 - y1)sq)//
	public static double distance (int step1_x, int step1_y) {
		// step1 subtract x2-x1, y2-y1 and put them into equation
		// step2 add
		// step3 sq
		double d = Math.sqrt(Math.pow(step1_x, 2) + Math.pow(step1_y, 2));
		return d;
	}
}
