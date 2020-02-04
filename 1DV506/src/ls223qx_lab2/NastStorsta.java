package ls223qx_lab2;

import java.util.Scanner;

public class NastStorsta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N_NUMBERS = 10; // Controls how many numbers the program is expecting.

		System.out.print("Mata in " + N_NUMBERS + " heltal: ");
		
		int largestNumber = Integer.MIN_VALUE; // Handy way of setting an integer to the minimum possible value.
		int secondNumber = Integer.MIN_VALUE;
		int currentNumber = 0; // Holding variable.

		for (int i = 0; i < N_NUMBERS + 1; i++) {
			try { // Simple error detection
				currentNumber = sc.nextInt();
			}
			catch (Exception e) {
				System.err.println("Det där var väl inte ett nummer, eller?");
				System.exit(-1);
			}

			if (currentNumber > largestNumber) {
				// If new largest number is found, update the second number with the
				// old largest number and then update the largest number with the current number.
				secondNumber = largestNumber;
				largestNumber = currentNumber;
			}
			else if (currentNumber == largestNumber) { // If the largest number is found two times, update the second largest number with the current number.
				secondNumber = currentNumber;
			}

			if ((currentNumber < largestNumber) && currentNumber > secondNumber) {
				/*
				 * If the current number is less than the largest number AND the current number
				 * is larger than the stored second largest, update the second largest number,
				 */
				secondNumber = currentNumber;
			}
		}
		sc.close();
		System.out.println("Det näst största talet är: " + secondNumber);
	}
}