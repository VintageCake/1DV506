package ls223qx_lab2;

import java.util.Scanner; 

public class RaknaA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create scanner object for later use
		
		int lowercaseACount = 0; // Counter variables for instances of upper and lower case characters.
		int uppercaseACount = 0;
		
		System.out.print("Mata in en textrad: "); 
		String input = sc.nextLine(); // Get input
		sc.close();
		
		for (int i = 0; i < input.length(); i++) { // Loop through all characters in input.
			if (input.charAt(i) == 'A') { // If the current char is A, add 1 to a counter.
				uppercaseACount++;
			}
			else if (input.charAt(i) == 'a') { // If the current char is a, add 1 to a counter.
				lowercaseACount++;
			}
		}
		
		System.out.println("Antal a: " + lowercaseACount); // Print information and counter.
		System.out.println("Antal A: " + uppercaseACount);
		

	}

}
