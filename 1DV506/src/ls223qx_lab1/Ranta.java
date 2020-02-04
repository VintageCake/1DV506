package ls223qx_lab1;

import java.util.Scanner;

public class Ranta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner class called, object created

		System.out.print("Besparingar �r noll: "); // Prompt for savings
		float savings = sc.nextFloat(); // Get amount 'deposited.'

		System.out.print("�rsr�nta (i procent): "); // Prompt for interest rate in percent
		float interest = sc.nextFloat() / 100F + 1.0F; // Conversion from percent to a decimal

		sc.close(); // dumps resources

		for (int i = 0; i < 5; i++) { // Calculate savings to 5 years from now.
			savings *= interest; // savings = savings * interest (iterated 5 times)
		}

		System.out.println("V�rdet p� besparingarna efter fem �r �r: " + Math.round(savings)); // Outputs rounded total
																								// savings.
	}

}
