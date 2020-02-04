package ls223qx_lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * The output differs slightly from the provided example, it find it likely that the example given implemented a solution using the scanner class.
 * The methods provided by Scanner will filter out some characters, typically delimiter characters. 
 */
public class RankaTecken {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Vintage\\Downloads\\HistoryOfProgramming.txt"); // File path

		int upperCounter = 0; // Counter variables
		int lowerCounter = 0;
		int whitespaceCounter = 0;
		int otherCounter = 0;
		
		System.out.println("Läser innehåll från: " + file);

		try (BufferedReader r = new BufferedReader(new FileReader(file))) { // A try-with-resources. Automatically closes all relevant resources when done.
			int intChar;
			// buffer.read() will output -1 when stream is finished (nothing more to read). 
			// BufferReader will output an integer value that represents a character. This can be converted to a character without any additional processing.
			while ((intChar = r.read()) != -1) {
				char currentChar = (char) intChar;
				if (Character.isUpperCase(currentChar)) {
					upperCounter++;
				}
				else if (Character.isLowerCase(currentChar)) {
					lowerCounter++;
				}
				else if (Character.isWhitespace(currentChar)) {
					whitespaceCounter++;
				}
				else { // Other is (Numbers, (), ", ,, ., +-=*, ', etc).
					otherCounter++; // Setting a breakpoint here and analysing currentChar didn't reveal anything weird being included. It appears that 152 is the correct number of 'other' characters.
				}
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File wasn't found, terminating...");
			System.exit(-1);
		}
		catch (IOException e) {
			System.out.println("Something happened to the file while reading, terminating...");
			System.exit(-1);
		}

		System.out.println("Antal stora bokstäver: " + upperCounter);
		System.out.println("Antal små bokstäver: " + lowerCounter);
		System.out.println("Antal \"whitespaces\": " + whitespaceCounter);
		System.out.println("Antal övriga: " + otherCounter);

	}

}
