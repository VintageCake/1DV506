package ls223qx_lab1;

public class Print {
	public static void main(String[] args) {
		final String testStr = "Kunskap är makt!"; // Declaration of final string, won't be modified.
		String squarePadding = "";

		System.out.println(testStr + "\n"); // Printing the unaltered string, as per the instructions. (along with a
											// newline)

		String[] xArr = testStr.split(" "); // Splits the string using spaces as breaking points.

		for (String word : xArr) { // Loops through all indexes of the newly created string array, a java foreach
									// equivalent to the foreach function in c#.
			System.out.println(word); // Prints each part of the array.
		}

		System.out.println(""); // Padding between each section of text.

		for (int i = 0; i < testStr.length() + 2; i++) { // Fills a string with equal-signs, dependent on the size of x.
															// Since we're adding two additional characters later,
															// continue for an additional two iterations.
			squarePadding += "=";
		}

		System.out.println(squarePadding); // Creation of a simple square by adding a top and a bottom to a simple
											// string with some symbols added to the sides.
		System.out.println("|" + testStr + "|");
		System.out.println(squarePadding);
	}
}
