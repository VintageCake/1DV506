package ls223qx_lab3;

public class FractionMain {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,2); // Test objects.
		Fraction f2 = new Fraction(3,9);
		Fraction f3 = new Fraction(-9, 5);
		Fraction f4 = new Fraction(0,9);
		Fraction f5 = new Fraction(3,0);
		
		
		Fraction fAdd = f1.add(f2); // Testing addition of fractions.
		System.out.println(fAdd.toString());
		
		Fraction fZeroCheck = f4.multiply(f5); // Multiplication of fractions
		System.out.println(fZeroCheck.toString());
		
		Fraction fMultiply = f1.multiply(f3);
		System.out.println("Mutliplication: " + f1.toString() + "*" + f3.toString() + " = " +fMultiply.toString());
		
		Fraction fSubtract = f4.subtract(f3);
		System.out.println("Subtraction: " +fSubtract.toString());
		
		Fraction fDivision = f2.divide(f1);
		System.out.println("Division: " +fDivision.toString());
		
		Fraction fequal = f1;
		System.out.println(fequal.isEqualTo(f1));
		
		System.out.println("Is "+ f3.toString() + " negtaive? " + f3.isNegative());
		System.out.println("Is "+ f2.toString() + " negtaive? " + f2.isNegative());

	}

}
