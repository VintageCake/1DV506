package ls223qx_lab1;

import java.util.Scanner;

public class Avstand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ange koordinat 1 (på formen x,y): "); // Assumes the user enters the point in a (#,#) format.
																// Point 1
		String xy1 = sc.nextLine();
		System.out.print("Ange koordinat 2 (på formen x,y): "); // Point 2
		String xy2 = sc.nextLine();
		sc.close();

		String[] xy1Split = xy1.split(","); // Splitting the string into parts in an array, discarding the comma.
		String[] xy2Split = xy2.split(",");

		int x1 = Integer.parseInt(xy1Split[0]); // Finding x1, x2, y1 and y2 and placing them into separate integers.
												// Mostly for readability.
		int x2 = Integer.parseInt(xy2Split[0]);
		int y1 = Integer.parseInt(xy1Split[1]);
		int y2 = Integer.parseInt(xy2Split[1]);

		double firstMathPass = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2); // Distance formula, without the square
																				// root.
		double distance = Math.sqrt(firstMathPass); // Applying square root, completing the equation.
		double roundedDistance = (Math.round(distance * 1000) / 1000d); // Rounding to three decimal points, using the
																		// 'regular' math.round() static function. May
																		// have been less abstract if BigDecimal or
																		// DecimalFormat would have been used instead for rounding.

		System.out.println("Avståndet mellan de två punkerna är: " + roundedDistance + " längdenheter");
	}

}
