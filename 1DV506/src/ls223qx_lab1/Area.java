package ls223qx_lab1;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner object, take input from console

		System.out.print("Ange en cirkelradie: "); // Prompt user
		double radius = sc.nextDouble(); // get radius from user
		sc.close();

		double area = radius * radius * Math.PI; // Calculates area of a circle, using math class which has a built in
													// static method for pi.
		area = Math.round(area * 10) / 10d; // Instead of bothering with DecimalFormat or BigDecimal classes, i simply
											// multiply by 10 and then use the 'regular' rounding function. Division by
											// 10 as to then get original number rounded to one decimal.

		System.out.println("Cirkelns area är: " + area);
	}
}
