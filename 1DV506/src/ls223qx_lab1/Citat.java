package ls223qx_lab1;

import java.util.Scanner; // Imports the scanner class from the java.util library. Used to gather input from a user via the console.

public class Citat {
	public static void main(String[] args) {
		System.out.print("Skriv in en rad text: "); // Asks user for input

		Scanner sc = new Scanner(System.in); // Calls the scanner class and creates an object, tied to console input.

		String textHold = sc.nextLine(); // Wait for input, continue when a string has been read from console input.
		sc.close(); // Throws away memory space used by the scanner object.

		System.out.println("Citat: " + "\"" + textHold + "\""); // Writes a quoted version of whatever the user wrote.
																// Escape sequences used in order to avoid them being
																// interpreted by the program.

	}
}
