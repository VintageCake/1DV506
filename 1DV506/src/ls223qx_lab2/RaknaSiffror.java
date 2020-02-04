package ls223qx_lab2;

import java.util.Scanner;

public class RaknaSiffror {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Mata in ett positivt heltal: "); // Prompt user for a positive whole number.
		String input = sc.nextLine();
		sc.close();

		int currentNumber = 0; // Holding variable for currently processed number

		int nZero = 0; // Counter variables
		int nEven = 0;
		int nUneven = 0;

		for (int i = 0; i < input.length(); i++) { // Loop through the string.

			try { // Attempt conversion, will catch characters that aren't numbers.
				currentNumber = Character.getNumericValue(input.charAt(i));
				if (currentNumber == -1) { // Converting the char '-' into an integer will return -1 (and not throw exception), meaning you
											// can quite easily detect a negative integer.
					System.err.println("Det där var ett negativt tal!");
					System.exit(-1);
				}
			}
			catch (Exception e) { // Exit if exception is found
				System.err.println("Något blev fel!");
				System.exit(-1);
			}

			if (currentNumber == 0) { // Find 0
				nZero++;
			}
			else if (currentNumber % 2 == 1) { // Get uneven
				nUneven++;
			}
			else { // If other expressions don't match, number is even.
				nEven++;
			}
		}
		System.out.println("Antal nollor: " + nZero); // Print info
		System.out.println("Antal udda: " + nUneven);
		System.out.println("Antal jämna: " + nEven);
	}

}
