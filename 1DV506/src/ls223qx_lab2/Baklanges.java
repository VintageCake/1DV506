package ls223qx_lab2;

import java.util.Scanner;

public class Baklanges {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		Scanner sc = new Scanner(System.in); 

		System.out.print("Mata in en textrad: "); // Prompt user for input

		String consoleInput = sc.nextLine(); // Get user input
		sc.close();

		for (int i = consoleInput.length()-1; i >= 0; i--) { // Iterates backwards
			str.append(consoleInput.charAt(i)); // Appends the selected char to a StringBuilder object.
		}
		String reversedWord = str.toString(); // StringBuilder object is converted into a normal string for later output.

		System.out.println("Baklänges: " + reversedWord); 
	}

}
