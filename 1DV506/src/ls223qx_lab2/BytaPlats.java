package ls223qx_lab2;

import java.util.ArrayList;

public class BytaPlats {
	public static void main(String[] args) {
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D' };
		ArrayList<Character> textReversed = new ArrayList<>(); // Declare list with generic type of character

		System.out.println(text);
		
		for (int i = text.length-1; i >= 0; i--) { // Add all the characters into the list from the array, in reverse
			textReversed.add(text[i]);
		}
		for (int i = 0; i < textReversed.size(); i++) { // Rewrite the original array with the list values
			text[i] = textReversed.get(i);
		}
		System.out.println(text); // print the rewritten array
	}

}
