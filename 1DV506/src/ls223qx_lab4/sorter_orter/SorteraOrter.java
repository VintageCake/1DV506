package ls223qx_lab4.sorter_orter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Do note that this document was previously formatted with the cp1252 text encoding standard.
 * This was later changed to UTF-8 in order to retain correct encoding of the 'special' characters from the text file.
 * 
 * The input format expected is:
 * "
 * ZIPCODE
 * NAME
 * ;
 * "
 * Any other format will break this program, since the counter for how many places were found are based on the number of semicolons, which are expected to be 1 per place.
 */

public class SorteraOrter { // Get from text file
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Ange en fil att skanna!");
			System.exit(-1);
		}
		File inputFile = new File(args[0]);
		System.out.println("Läser orter från filen: " + inputFile);

		List<Integer> scZip = new ArrayList<>(); // Separate lists for zip and place
		List<String> scOrt = new ArrayList<>();
		
		Ort[] orter = null; // Will later hold all places as objects

		int ortCounter = 0;
		try (Scanner sc = new Scanner(inputFile)) { // Try with resources, scans the whole file.
			while (sc.hasNext()) {
				scZip.add(sc.nextInt());
				scOrt.add(sc.next());
				
				String dx = sc.next();
				if (dx.equals(";")) { 
					ortCounter++;
				}
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File wasn't found, terminating...");
			System.exit(-1);
		}

		orter = new Ort[ortCounter];
		for (int i = 0; i < ortCounter; i++) { // Creates a new Ort objet and assigns the new object with scanned values.
			orter[i] = new Ort(scZip.get(i), scOrt.get(i));
		}
		System.out.println("Antal orter funna: " + ortCounter);
		System.out.println("Osorterade:");

		for (int i = 0; i < orter.length; i++) { // Print info
			System.out.println(orter[i].getFull());
		}
		System.out.println();

		Arrays.sort(orter);
		System.out.println("Sorterade:");
		for (int i = 0; i < orter.length; i++) { // Sorts the list
			System.out.println(orter[i].getFull());
		}
	}

}
