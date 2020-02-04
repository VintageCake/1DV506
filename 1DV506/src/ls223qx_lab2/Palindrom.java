package ls223qx_lab2;
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		StringBuilder backwards = new StringBuilder(); // Using two forwardStringbuilders, one for the cleaned input, one for the word backwards.
		StringBuilder forwardStr = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Skriv in en textrad: ");
		String input = scan.nextLine();
		scan.close();
		
		for (int i = 0; i < input.length(); i++) { // Clean input (removes anything that isn't a valid letter)
			if (Character.isLetter(input.charAt(i))){
				forwardStr.append(input.charAt(i));
			}
		}
		String cleanedInput = forwardStr.toString();
		
		for (int i = cleanedInput.length()-1; i >= 0; i--) { // Loop through the cleaned output backwards.
			backwards.append(cleanedInput.charAt(i));
		}
		
		String palindromeCheck = backwards.toString(); // Conversion from object to string, since we can't use string.compareTo on an object.
		
		if (palindromeCheck.compareToIgnoreCase(cleanedInput) == 0) { // string1.compareTo(string2) will return 0 if the two strings match, using the non-case sensitive version.
			System.out.println("\"" + input + "\" är ett palindrom!");
		}
		else {
			System.out.println("Inte ett palindrom!");
		}
		
	}

}
