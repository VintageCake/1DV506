package ls223qx_lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class OmvandOrdning {
	public static void main(String[] args) {
		ArrayList<Integer> savedNumbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int inputNumber = 0; // Initialise holder variable
		int iterator = 1; // Count number of inputs with this variable
		
		System.out.println("Skriv ett antal heltal, avsluta med ett negativt");
		while (inputNumber >= 0) { // Stop once negative number is detected
			try { // Basic try-catch to error-correct an unexpected input
			System.out.print("Tal " + iterator + ": ");
			inputNumber = Integer.parseInt(sc.nextLine()); // attempt conversion
			savedNumbers.add(inputNumber);
			iterator++;
			}
			catch (Exception e) {
				System.err.print("Något gick fel!\n");
			}
		}
		sc.close();
		savedNumbers.remove(savedNumbers.size()-1); // Remove the negative value
		System.out.println("Antal positiva: " + savedNumbers.size());
		
		int[] reversedNumbers = new int[savedNumbers.size()];
		for (int backwards = savedNumbers.size()-1, forwards = 0; backwards >= 0; backwards--, forwards++) { // Taken from the book (Y.liang ch7), a nifty way to reverse an array.
			reversedNumbers[forwards] = savedNumbers.get(backwards);										//Stops going at the halfway-point in order to not simply end up with what you started with.
		}
		
		System.out.println("Baklänges: ");
		for (int i = 0; i < reversedNumbers.length; i++) { // Print results from reversedNumbers
			if (i == reversedNumbers.length-1) { // If-else in order to comply with format given in lab-instructions
				// Makes sure that the last entry doesn't have a comma.
				System.out.print(reversedNumbers[i]); 
			}
			else {
				System.out.print(reversedNumbers[i] + ", ");
			}
		}
		
	}

}
