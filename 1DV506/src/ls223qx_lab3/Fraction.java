package ls223qx_lab3;

public class Fraction {
	private int numerator = 1; // Avoiding zeros, thus the default value will be 1/1 for a new object.
	private int denominator = 1;
	
	public Fraction() { // Constructors
		
	}
	public Fraction(int n, int d) { 
		numerator = n;
		denominator = d;
	}
	public int getNumerator() { // Simple mutators and accessors.
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int n) {
		numerator = n;
	}
	public void setDenominator(int d) {
		denominator = d;
	}
	
	public boolean isNegative() {
		if (numerator < 0 ^ denominator < 0 ) { // XOR, since two minus signs in a fraction is going to give a positive result.
			return true;
		}
		return false;
	}
	public void zeroCheck(Fraction f) { // Simply checks if the denominator of referenced fraction is 0.
		if (f.getDenominator() == 0) {
			System.out.println("Zero in denominator!!"); // Should be System.err, but will throw off order in the console.
		}
	}
	
	public boolean isEqualTo(Fraction f) { // Using the String.equals method to find out if the strings match, does NOT take into account the value of each fraction.
		if (this.toString().equals(f.toString())) {
			return true;
		}
		return false;
	}
	public String toString() { // Simple toString method that simply puts numerator and denominator into a string with very slight formatting for brevity.
		return this.getNumerator() + "/" + this.getDenominator();
	}
	
	public Fraction add(Fraction f) { // Addition algorithm is the same as doing it on paper.
		int numerator1 = this.getNumerator();
		int denominator1 = this.getDenominator();
		int numerator2 = f.getNumerator();
		int denominator2 = f.getDenominator();
		
		int resultNumerator = (numerator1*denominator2) + (numerator2*denominator1);
		int resultDenominator = (denominator1*denominator2);
		Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
		zeroCheck(resultFraction);
		return resultFraction; // Returns a new reference to a fraction object.
	}
	
	public Fraction subtract(Fraction f) { // Subtraction algorithm in a similar manner as to when you're doing it on paper.
		int numerator1 = this.getNumerator();
		int denominator1 = this.getDenominator();
		int numerator2 = f.getNumerator();
		int denominator2 = f.getDenominator();
		
		int resultNumerator = (numerator1*denominator2) - (numerator2*denominator1);
		int resultDenominator = (denominator1*denominator2);
		Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
		zeroCheck(resultFraction); 
		return resultFraction;
	}
	
	public Fraction multiply(Fraction f) { // Multiplication is rather simple, since it's straight multiplication of the respective numerators and denominators.
		int resultNumerator = f.getNumerator() * this.getNumerator();
		int resultDenominator = f.getDenominator() * this.getDenominator();
		Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
		zeroCheck(resultFraction);
		return resultFraction;
	}
	
	public Fraction divide(Fraction f) { // Division is 'flipped' multiplication.
		int resultNumerator = this.getNumerator()*f.getDenominator();
		int resultDenominator = this.getDenominator()*f.getNumerator();
		Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
		zeroCheck(resultFraction);
		return resultFraction;
	}
	
	

}
