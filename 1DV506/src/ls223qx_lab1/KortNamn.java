package ls223qx_lab1;

import java.util.Scanner;

public class KortNamn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner object created

		System.out.print("Förnamn: "); // Prompt for first name
		String firstName = sc.nextLine();

		System.out.print("Efternamn: "); // Prompt for last name
		String lastName = sc.nextLine();
		sc.close(); // Dump resources

		String shortFirstName = ((firstName.charAt(0) + ".")); // Gets the first letter of the string, adds a dot.
		String lastNameSubstring = (lastName.substring(0, 4)); // Creates a new string via a substring of lastName containing the first four characters. 
		System.out.println("Kort namn: " + shortFirstName + " " + lastNameSubstring);
	}

}
