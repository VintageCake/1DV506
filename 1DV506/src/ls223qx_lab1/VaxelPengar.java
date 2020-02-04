package ls223qx_lab1;

import java.util.Scanner;

public class VaxelPengar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner object

		System.out.print("Ange kostnaden: "); // Prompt for cost
		float cost = sc.nextFloat();

		System.out.print("Ange erhållet belopp: "); // Prompt for whatever you gave the cashier.
		int moneyGiven = sc.nextInt(); // Assuming only whole numbers here, since the example implies that you can only
										// give cash in integers.
		sc.close(); // Dumping memory of the scanner object, since we're finished using it.

		int roundedCost = Math.round(cost); // Rounds the cost, since we're restricting ourselves to a minimum of 'one
											// crown calculations.'
		int back = moneyGiven - roundedCost; // The total value of what you're getting back
		System.out.println("Tillbaka: " + back);

		int thousands = back / 1000; // Abusing the fact that integer division truncates the decimal (it doesn't
										// round up), which means that the whole number remaining will always be able to
										// be subtracted from the original value (after it has been corrected).
		back -= thousands * 1000; // Subtracting the 'notes' from the original value.

		int fiveHundreds = back / 500; // repeats for each note
		back -= fiveHundreds * 500;

		int twoHundreds = back / 200;
		back -= twoHundreds * 200;

		int hundreds = back / 100;
		back -= hundreds * 100;

		int fifties = back / 50;
		back -= fifties * 50;

		int twenties = back / 20;
		back -= twenties * 20;

		int tens = back / 10;
		back -= tens * 10;

		int fivers = back / 5;
		back -= fivers * 5;

		int two = back / 2;
		back -= two * 2;

		int ones = back; // remainder will be whole crowns, 9-0.

		System.out.println("1000-lappar: " + thousands); // Pretty self-explanatory, prints each note that you would
															// have gotten back. As per the example in the instructions.
		System.out.println("500-lappar: " + fiveHundreds);
		System.out.println("200-lappar: " + twoHundreds);
		System.out.println("100-lappar: " + hundreds);
		System.out.println("50-lappar: " + fifties);
		System.out.println("20-lappar: " + twenties);
		System.out.println("10-kronor: " + tens);
		System.out.println("5-kronor: " + fivers);
		System.out.println("2-kronor: " + two);
		System.out.println("1-kronor: " + ones);
	}
}
