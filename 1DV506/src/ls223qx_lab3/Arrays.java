package ls223qx_lab3;


public class Arrays {
	public static void main(String[] args) {
		int[] array1 = {1,5,7,89,2}; // Test arrays
		int[] array2 = {1,2,3,4,5,6,7,8,9,10};
		
		int[] array3 = addN(array2, 3);
		int[] array4 = reverse(array2);
		
		int[] subSequence = {5,6,7};
		
		
		System.out.println("Array1: " + toString(array1));
		System.out.println("Array2: " + toString(array2));
		
		System.out.println("\nTesting sum method on array1 and 2");
		System.out.println(sum(array1));
		System.out.println(sum(array2));

		
		System.out.println("\nTesting addN and reverse");
		System.out.println(toString(array3)); // Print array 3 and 4 as a string.
		System.out.println(toString(array4));
		
		int n = 6; // Number to find in array, fiddle with this variable to test program!
		System.out.println("\nIs the number "+ n +" present in array1?");
		if (hasN(array1,n)) { // See if array1 has the number n.
			System.out.println("Yes!");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println(toString(sort(array1)));
		System.out.println(hasSubsequence(array2, subSequence));
		
		System.out.println(isLarger(array1, array2));

	}

	public static int sum(int[] arr) { // Sums up all numbers in array and return the total.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	public static String toString(int[] arr) { // Builds a StringBuilder by looping through a passed array.
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			str.append(arr[i]);
			str.append(" ");
		}
		return str.toString();
	}
	
	public static int[] addN(int[] arr, int i) { // Returns a new array that contains the same values of the old one, except with a fixed number added to all elements.
		int[] addInts = copy(arr);
		for (int x = 0; x<addInts.length; x++) { // Modifies the new array.
			addInts[x] += i;
		}
		return addInts;
	}
	
	public static int[] reverse(int[] arr) { // Copies and reverses the new array, returns an array reference which points to a reversed array.
		int[] reversedArray = new int[arr.length];
		for (int i = reversedArray.length-1, j = 0; i >= 0; i--, j++) {
			reversedArray[j] = arr[i];
		}
		
		return reversedArray;
	}
	
	public static boolean hasN(int[] arr, int n) { // Find integer N in array, returns true if found.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		return false;
	}
	
	public static void replaceAll(int[] arr, int old, int nw) { // replace instance of old value with new value
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == old) {
				arr[i] = nw;
			}
		}
	}
	
	public static int[] sort(int[] arr) { // Simple sort algorithm, pretty much the same algorithm as found in Y.Liang's example in ch7.
		int[] sortingArray = copy(arr);
		
		for (int i = 0; i < arr.length-1; i++) { // Last index will always be the largest using a swap-type method, so no need to iterate over the last index.
			int smallestNumber = sortingArray[i]; // Tracking variables for the smallest number and the index of the smallest number.
			int smallestNumberIndex = i;
			
			for (int j = i + 1 ; j < arr.length;j++) { // Begin looking at indexes that starts after the current 'main' index.
				if (smallestNumber > sortingArray[j]) { // Look for number that is LESS than the 'main' current number.
					smallestNumber = sortingArray[j]; // IF that number is found, update the two tracking variables.
					smallestNumberIndex = j;
				}
			}
			if(smallestNumberIndex != i) { // At the end of the loop, check if a smaller number was found
				sortingArray[smallestNumberIndex] = sortingArray[i]; // Swap positions of the smallest number found and the current index  in the 'main' loop.
				sortingArray[i] = smallestNumber;
			}

		}
		return sortingArray;
		
	}
	
	public static boolean hasSubsequence(int[] arr, int[] sub) { // Returns true if subsequence specified is found within referenced array.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sub[0]) { // Trigger once the first number matches
				int counter = 1;
				for (int x = 1, y = i; x < sub.length; x++, y++) { // Start looking through both arrays
					if (arr[y] == sub[x]) { // If stuff keeps matching, increase a counter.
						counter++;
					}
					else {
						break; // If a number didn't match then it is useless to keep looking for matches.
					}
					if (counter == sub.length) { // If the 'match' counter is the same value as the subsequence length, everything has matched.
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean isLarger(int[] a1, int[] a2) { // Arbitrary method, could do with a bit of shortening but really can't be bothered since it seems to work.
		if (equals(a1, a2)) { // If both arrays happen to be the same, one of them won't be larger than the other.
			return false;
		}
		
		
		boolean a1Largest = (a1.length >= a2.length); // Find out which one is longer, as to not get an index out of bounds exception later.
		if (a1Largest && hasSubsequence(a1,a2)) { // Checks to see if a2 is a subsequence of a1, if a1 is then larger anyway we can return true according to the instructions.
			return true;
		}
		
		int maxLength = 0; // Find length of shortest array.
		if (a1Largest) {
			maxLength = a2.length;
		}
		else {
			maxLength = a1.length;
		}
		
		if (a1Largest) { // Start evaluating indexes from both arrays. 
			for (int i = 0; i < maxLength; i++) {
				if (a1[i] > a2[i]) { // Return true if an index from a1 is larger than same index in a2.
					return true;
				}
				else if (a1[i] < a2[i]) { // Return false if index from a2 is larger than same index from a1.
					return false;
				}
			}
		}
		return false;
	}
	
	public static int[] copy(int[] arr) { // Returns a new reference with identical content to specified array.
		int[] arrayCopy = new int[arr.length];
		for (int x = 0; x < arrayCopy.length; x++) { // Copy each index to new array
			arrayCopy[x] = arr[x];
		}
		return arrayCopy; 
	}

	public static boolean equals(int[] a1, int[] a2) { // checks if two arrays are equal to each other
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}

}
