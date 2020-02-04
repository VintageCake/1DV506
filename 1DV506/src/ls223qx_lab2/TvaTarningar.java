package ls223qx_lab2;

import java.util.Random;

public class TvaTarningar {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int amountOfRolls = 10 * 1000;
		int[] allDiceRolls = new int[amountOfRolls]; // Size is the same as the amount of dice rolls. Will hold the result from each dice roll.
		int[] resultDiceCounter = new int[11]; // 11 data points

		for (int i = 0; i < amountOfRolls; i++) { // Simulate dice-rolls, put results into an array.
			int firstDice = rand.nextInt(6) + 1; // Returns value between 0 (inclusive) and 6 (exclusive). Adding one to it gives usable output 1-6.
			int secondDice = rand.nextInt(6) + 1;
			allDiceRolls[i] = firstDice + secondDice;
		}
		
		for (int rollCounter = 2; rollCounter <= 12; rollCounter++) { // Linear search through the array, matching a specific 'key'.
			// Performance intensive for large arrays.
			for (int i = 0; i < allDiceRolls.length; i++) { // Loop through the entire array, look for specific digit.
				if (allDiceRolls[i] == rollCounter) {
					resultDiceCounter[rollCounter - 2]++;
				}
			}
		}
		System.out.println("Frequency table (sum, count) for rolling two dices 10000 times"); // Giving information along with expected format to user
		
		for (int i = 0; i < resultDiceCounter.length; i++) { // Printing (digit), "TAB" (number of occurrences).
			System.out.println((i + 2) + "\t" + resultDiceCounter[i]);
		}
	}
}
