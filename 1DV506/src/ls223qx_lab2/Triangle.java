package ls223qx_lab2;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int number = 0;
		number = getInt(); // Method which prompts user for an uneven number, with error detection and correction.

		System.out.println("Rätvinklig triangel: \n");
		/*
		 * This took way too long to figure out, since the shape specified in the lab is surprisingly hard to express as code.
		 * 
		 * Loop through all the 'rows' of the triangle.
		 * For each row, first check if any spaces should be printed.
		 * After the spaces have been printed, print the remaining space as asterisks.
		 * The total print size for each line is equal to the starting 'number'.
		 * 
		 */
		for (int row = number; row > 0; row--) { 

			for (int spaces = number; spaces > row; spaces--) { // Stop printing once the current value for the row has been reached.
				System.out.print(" ");
			}
			for (int stars = row; stars > 0; stars--) { // Start printing after the spaces loop is finished, stop printing when total characters == number.
				System.out.print("*");
			}
			System.out.println(""); // Newline between each row.
		}

		System.out.println("Likbent triangel: \n");
		/*
		 * This is probably the worst way to do this, but this is what i came up with.
		 * 
		 * Instead of having a 'fixed size' print area equal to the 'number' variable, I figured I'd only pad from one side in order to reduce code complexion.
		 * The problem with this is that it's really hard to figure out how many spaces to pad with when the main loop increases by 2 with every iteration.
		 * Turns out that the amount of spaces needed for the first star is equal to the total rows in the triangle. (As i later found out is actually written in the assignment.)
		 * 
		 * What ended up happening is that the first nested loop first figures out how many rows in total will be had in the triangle and assigns that as the iterator.
		 * (int) (number / 2.0 + 0.5) == Amount of rows -- //Take note that (int) x + 0.5 is the same as Math.round()//
		 * The proper amount of stars are then printed with the expression stars < row, which basically means print variable 'row' amount of stars.
		 * After each row iteration, the amount of spaces which are to be printed are subtracted by one.
		 * 
		 * Because the main loop increases by 2 with each iteration, every iteration is instead tracked with a variable: counter 'r'.
		 * 
		 */
		int r = 0;
		
		for (int row = 1; row <= number; row+=2) {
			for (int pad = (int) ((number / 2.0) + 0.5) - r; pad > 1; pad--) {
				System.out.print(" ");
			}
			for (int stars = 0; stars < row; stars++ ) {
				System.out.print("*");
			}
			r++;
			System.out.println(""); // Newline between each row.
		}
		
	}
	
	public static int getInt() { // Method for getting an int from the user.
		Boolean loop = true;
		int parsedInt = 0;
		Scanner sc = new Scanner(System.in);
		
		while (loop == true) { // Simple while-loop with an easy 'toggle' expression.
			
			System.out.print("Ange ett udda heltal: "); // Prompt user for uneven whole number.
			String input = sc.nextLine(); // Get input as string

			try { // Try-catch will catch any exceptions, an exception will break execution of the try-block and move execution to the catch-block.
				parsedInt = Integer.parseInt(input); // Attempt to parse to an integer, danger of exception.
				
				if (parsedInt % 2 == 1) { // Check if uneven, also prevents negative numbers
					loop = false; // Break loop if uneven.
				}
				else {
					System.err.println("\nUDDA positiva helatal, tack."); // Let the user know that the number wasn't uneven.
				}
			}
			catch (Exception e) { // Catch if whatever the user input wasn't an integer.
				System.err.println("Det där var inte ett heltal.");
			}
		}
		sc.close();
		return parsedInt;
	}
}
