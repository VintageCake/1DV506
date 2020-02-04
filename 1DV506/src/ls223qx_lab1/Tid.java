package ls223qx_lab1;

import java.util.Scanner;

public class Tid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // calling scanner class

		System.out.print("Ange antal sekunder: "); // prompt user
		int inputSeconds = sc.nextInt(); // get an integer from console
		sc.close(); // dump scanner resources

		int seconds = inputSeconds % 60; // Total seconds Mod 60 to get remaining seconds.
		int minutes = (inputSeconds / 60) % 60; // Total seconds, divided by 60 and then Mod 60 to get remaining
												// minutes.
		int hours = (inputSeconds / 60 / 60); // Division by 60 twice to get total hours. Will become a float, but since
												// this is an int, the decimal will be truncated.

		System.out.println( // Outputs hours, minutes and seconds.
				"Detta motsvarar: " + hours + " timmar, " + minutes + " minuter och " + seconds + " sekunder.");
	}
}
