package ls223qx_lab2;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.Collections; // Used for list sorting

public class Lonerevision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> salaries = new ArrayList<>(); // Lists will be much more adaptable to an unknown number of integer inputs.

		System.out.print("Mata in löner (och avsluta med 'X'): ");
		
		while (sc.hasNextInt()) { // Has a similar wait function to scanner.nextX().
			salaries.add(sc.nextInt()); // Will auto-handle spaces just fine.
		}
		sc.close();

		Collections.sort(salaries); // Sort the ArrayList, with low values ending up in the bottom. Equivalent to
									// array.sort().

		int medianSalary = 0;
		if (salaries.size() % 2 == 0) {
			/*
			 * Imagine we were to split the data structure in half, if we have 6 elements,
			 * each structure would have 3 elements each. In order to find the median we
			 * have to create a new 'made up' value that sits between the two data
			 * structures. This means we take the two elements of the fictional data
			 * structures that are CLOSEST to each other and average them out. The result is
			 * a hypothetical median value.
			 * 
			 */
			int middlePlus = salaries.size() / 2;
			int middleMinus = middlePlus - 1;
			medianSalary = (salaries.get(middleMinus) + salaries.get(middlePlus)) / 2;
		}
		else {
			medianSalary = salaries.get(salaries.size() / 2); 
		}

		int allSalaries = 0;
		for (int i = 0; i < salaries.size(); i++) { // Simple loop which adds all salaries together.
			allSalaries += salaries.get(i);
		}
		int averageSalary = allSalaries / salaries.size(); // Division by total number of salaries to get the average salary.

		int lowestSalary = salaries.get(0); // Since the list is sorted, the first element will contain the lowest value.
		int highestSalary = salaries.get(salaries.size() - 1); // Last element will contain the highest value.
		int paySpread = highestSalary - lowestSalary; // Difference between highest and lowest is our spread.
		
		
		System.out.println("Medianlön: " + medianSalary);
		System.out.println("Medellön: " + averageSalary);
		System.out.println("Lönespridning: " + paySpread);

	}

}
