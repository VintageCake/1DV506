package ls223qx_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * The java class GenerateRandomTempFile was used to generate file with random numbers.
 */
public class Histogram {
	public static void main(String[] args) {
		File randomNumbersFile = null; // Empty object declared to be filled later.

		if (args.length != 0) {
			System.out.println("Läser från " + args[0]); // Do note that the argument input in this program was tested with the Run -> Run Configurations -> Arguments function in eclipse.
			randomNumbersFile = new File(args[0]); // Set object file to input argument
		}
		else {
			randomNumbersFile = new File("C:\\Temp\\heltal.dat"); // Otherwise, use this value that i used for this lab.
		}

		Scanner fileScan = null; // Counters and initial scanner declaration
		int rangeCounter = 0;
		int outCounter = 0;
		int[] simpleCounter = new int[10];

		try { // Large try-catch block for scanner file input and .nextInt handling.
			fileScan = new Scanner(randomNumbersFile);

			while (fileScan.hasNextInt()) {
				int currentNumber = fileScan.nextInt();
				 // Large block which CAN be done with a single for-loop and modifying ranges using the iterator, using the following expressions: (1+(n*10), 10+(n*10)
				// That type of solution may be performance intensive, since it would essentially be a bunch of "if" which has to be evaluated one after another.
				
				// Untested pseudocode, as a proof of concept //
				
			 /*	for (int i = 0; i < 10; i++) { 
			 *		if (currentNumber >= 1+(i*10) && currentNumber <= 10+(n*10)) {
			 *			simpleCounter[i]++;
		     *		}
			 *	}
			 */	
				if (currentNumber >= 1 && currentNumber <= 10) { 
					simpleCounter[0]++;							
				}
				else if (currentNumber >= 11 && currentNumber <= 20) {
					simpleCounter[1]++;
				}
				else if (currentNumber >= 21 && currentNumber <= 30) {
					simpleCounter[2]++;
				}
				else if (currentNumber >= 31 && currentNumber <= 40) {
					simpleCounter[3]++;
				}
				else if (currentNumber >= 41 && currentNumber <= 50) {
					simpleCounter[4]++;
				}
				else if (currentNumber >= 51 && currentNumber <= 60) {
					simpleCounter[5]++;
				}
				else if (currentNumber >= 61 && currentNumber <= 70) {
					simpleCounter[6]++;
				}
				else if (currentNumber >= 71 && currentNumber <= 80) {
					simpleCounter[7]++;
				}
				else if (currentNumber >= 81 && currentNumber <= 90) {
					simpleCounter[8]++;
				}
				else if (currentNumber >= 91 && currentNumber <= 100) {
					simpleCounter[9]++;
				}

				if (currentNumber >= 1 && currentNumber <= 100) {
					rangeCounter++;
				}
				else {
					outCounter++;
				}
			}

		}
		catch (InputMismatchException e) {
			System.out.println("Någonting oväntat hittades i filen, stoppar avläsning");
			System.out.println(e.getMessage());
			System.out.println("Utdata reflekterar skanningen upp till den ohanterade karakt�ren.");
		}
		catch (FileNotFoundException e) {
			System.out.println("Filen hittades inte, avslutar programmet...");
			System.exit(-1);
		}
		catch (Exception e) { // Generic exception handling
			e.printStackTrace();
			fileScan.close();
			System.exit(-1);
		}
		finally {
			fileScan.close();
		}
		
		//Output handling below

		System.out.println("Antal i intervallet [1, 100]: " + rangeCounter);
		System.out.println("Antal utanför interavllet: " + outCounter);

		for (int i = 0; i < 10; i++) { 
			System.out.print(formatStars(i));
			for (int j = 0; j < simpleCounter[i]; j++) { // Output N stars, where N is the value of simpleCounter[i].
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static String formatStars(int n) { // The first 'half' of the output.
		String str = "";
		str = n * 10 + 1 + "-" + (1 + n) * 10;
		if (str.length() < 6) {
			while (str.length() < 6) {
				str += " ";
			}
		}
		str += " | ";
		return str;
	}
}
