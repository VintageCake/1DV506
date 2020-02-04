package ls223qx_lab1;

public class Slumpsumma {
	public static void main(String[] args) {
		int[] randArray = new int[5]; // Creating an array which will hold the five random numbers.
		int randSum = 0; // variable which will later hold the sum

		for (int i = 0; i < 5; i++) {
			randArray[i] = (int) ((Math.random() * 100 + 1)); // Abusing the fact that casting to int means you truncate
																// the decimal, we can use Math.random() instead of
																// using an imported random class. Because the output of
																// math.random() is between 0.0 and 0.99.... but never
																// 1.0, we can multiply the static method output by a
																// hundred and add one to it. Truncating the decimal
																// will then yield an output 1-100.
		}
		System.out.print("Fem genererade slumptal: ");
		for (int c : randArray) {
			System.out.print(c + " "); // Prints each number individually.
		}
		for (int x : randArray) { // Foreach loop which adds all the numbers into a variable.
			randSum += x;
		}
		System.out.println("\nSumma av slumptal: " + randSum); // Print sum.

	}

}
