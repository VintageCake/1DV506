package ls223qx_lab3;

import java.util.ArrayList;
// Unfinished last assignment
public class Pnr {

	public static void main(String[] args) {
		String pn1 = "971227-2617"; // test variables
		String pn2 = "531101-1182";
		String pn3 = pn1;
		String invalidPn = "12345-3";
		String wrongChecksum = "971227-2618";
		String wrongDate = "971234-2617";
		
		System.out.println("Get first and second parts");
		System.out.println(getFirstPart(pn1));
		System.out.println(getSecondPart(pn1));
		
		System.out.println("Check if female");
		System.out.println(isFemaleNumber(pn1));
		System.out.println(isFemaleNumber(pn2));
		
		System.out.println("Check if equal");
		System.out.println(areEqual(pn1, pn2));
		System.out.println(areEqual(pn1, pn3));
		
		System.out.println("Sanity checking numbers");
		System.out.println(isCorrect(pn1));
		System.out.println(isCorrect(pn2));
		System.out.println(isCorrect(invalidPn)); // Wrong format
		System.out.println(isCorrect(wrongChecksum)); // Last digit is wrong
		System.out.println("Date: " + isCorrect(wrongDate)); // Invalid date range
		
	}
	
	public static String getFirstPart(String pnr) { // Get first 6 characters
		StringBuilder str = new StringBuilder();
		int length = 6;
		for (int i = 0; i < length; i++) {
			str.append(pnr.charAt(i));
		}
		return str.toString();
	}
	
	public static String getSecondPart(String pnr) { // Get last 4 characters
		StringBuilder str = new StringBuilder();
		for (int i = 7; i < pnr.length(); i++) {
			str.append(pnr.charAt(i));
		}
		return str.toString();
	}
	
	public static boolean isFemaleNumber(String pnr) {
			return (Character.getNumericValue(pnr.charAt(9)) % 2 == 0); // Check 9th digit even/uneven
		}
	
	public static boolean areEqual(String pnr1, String pnr2) { // Check if sent strings are the same, String has a native method for this as well.
		for (int i = 0; i < pnr1.length(); i++) {
			if (pnr1.charAt(i) != pnr2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	

	public static boolean isCorrect(String pnr) { // Simple date validation and format check
		if (pnr.length() !=11 || !pnr.matches("\\d{6}-\\d{4}")) {
			return false;
		}
		String date = getFirstPart(pnr);
		if (!isValidDate(date)){
			return false;
		}
		
		return true;
	}
	
	public static boolean isValidDate(String date) { // Super basic date validation (year is whatever, Month 1-12, Day 1-31)
		StringBuilder str = new StringBuilder();
		ArrayList<String> yearMonthDay = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < date.length(); i++) { // Split YYMMDD into YY, MM, DD in a list
			count++;
			str.append(date.charAt(i));
			if (count == 2) {
				count = 0;
				yearMonthDay.add(str.toString());
				str.delete(0, str.length());
			}
		}
		int months = Integer.parseInt(yearMonthDay.get(1));
		int days = Integer.parseInt(yearMonthDay.get(2));
		
		if ((days < 1 || days > 31) || (months < 1 || months > 12) ) { // If an unexpected range is found, then it's not a valid number.
			return false;
		}
		
		return true;
	}
	}

