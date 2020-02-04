package ls223qx_lab2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner object created.
		Random rand = new Random(); // Random object created.
		int guess;

		int randomNumber = rand.nextInt(100) + 1; // randomNumber assigned a random number between (0 and 99)+1. Output is 1-100 inclusive.
		
		for (int i = 1; i <= 10; i++) { // loop for 10 guesses max
			System.out.print("Gissning " + i + ": "); // Prompts user for guess
			
			guess = scan.nextInt(); // Get guess from user.
			
			if (guess == randomNumber) {
				if (i == 1) {
					System.out.println("R�tt svar efter bara en gissning!");
					System.exit(1);
				}
				else { // Appending comments
					System.out.print("R�tt svar efter " + i + " gissningar");
					if (i == 1) {
						System.out.println(" - tur!");
					}
					else if (i <= 3) {
						System.out.println(" - bra gissat!");
					}
					else if ( i < 7) {
						System.out.println(" - ok!");
					}
					System.exit(1);
				}
			}
			else if (guess > randomNumber) { // If the guess was higher, tell that to the user. Otherwise, tell user that their guess was lower than the magic number.
				System.out.println("Ledtr�d: l�gre");
			}
			else {
				System.out.println("Ledtr�d: h�gre");
			}
			
		}
		System.out.println("Du f�rlorade! Talet var: " + randomNumber);
		scan.close();
	}
}
