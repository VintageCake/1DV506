package ls223qx_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VindAvkylning {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.#"); // Calling DecimalFormat class and assigning an object with the
														// pattern (anyNumber.oneDecimal).
		Scanner sc = new Scanner(System.in); // call class, assign object

		System.out.print("Ange temperatur (C): "); // Prompting user for current temperature
		float currentTemperature = sc.nextFloat(); // get float from console input

		System.out.print("Ange vindhastigheten (m/s): "); // prompt user for current wind speed
		float windSpeedM = sc.nextFloat();
		sc.close(); // Dumps resources

		float windSpeedKMH = windSpeedM * 3.6f; // Conversion to km/h.

		double windChill = 13.12 + 0.6215 * currentTemperature
				+ (-11.37 + 0.3965 * currentTemperature) * (Math.pow(windSpeedKMH, 0.16));
		// Modified given formula, 'broken out' v^0.16 where it appears twice. New
		// formula is: 13.12 + 0.6215*T + (-11.37 + 0.3965*T)*v^0.16
		// Lots of time wasted when i forgot to convert to km/h before applying formula.

		String roundedChill = df.format(windChill); // Formatting to one decimal point by using DecimalFormat.

		System.out.print("Upplevd temperatur (C): " + roundedChill); // Printing processed temperature

	}

}
