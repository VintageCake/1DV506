package ls223qx_lab1;

import java.util.Scanner;

public class SummaAvTre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Call scanner class, create object

		System.out.print("Ange ett tresiffrigt heltal: "); // Prompts user for an int in the hundreds
		int inputHundred = sc.nextInt(); // Get int from user
		sc.close(); // Dump resources

		int hundreds = inputHundred / 100; // Gets the number in the third position, decimals truncated.
		int tens = inputHundred % 100 / 10; // Gets the number in the second position, by first 'removing' the third -
											// - position number by using Mod 100 and then dividing the result by 10
											// (which truncates the decimal/first number position).

		int ones = inputHundred % 10; // Mod 10 will spit out the number in the first position.

		System.out.println("Summa av heltal: " + (hundreds + tens + ones)); // Outputs the sum of the three numbers.
	}
}
