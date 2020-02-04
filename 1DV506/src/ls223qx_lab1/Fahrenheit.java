package ls223qx_lab1;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner class
		float input; // declaration of input variable

		System.out.print("Ange en temperatur i Fahrenheit: "); // Asks user for input
		input = sc.nextFloat(); // Read console input, get float and dump it into a variable
		sc.close(); // Dump resources used by scanner

		float c = (input - 32) / (9F / 5);
		/*
		 * Converts console input to a floating point value, subtracts 32, divides
		 * result by 1.8 to get a value in C. Converted numerator to float, as to make
		 * sure the result will be a floating point value instead of an int.
		 */

		System.out.println("Motsvarande temperatur i Celcius är " + c); // Outputs info.
	}
}
