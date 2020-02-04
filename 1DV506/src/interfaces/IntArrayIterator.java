/**
 * IntArrayIterator.java
 * 22 dec 2014
 */
package interfaces;

import java.util.Iterator;

/**
 * @author jlnmsi
 *
 */
public class IntArrayIterator implements Iterator<Integer> {
	private int nextElement = 0;      // first element at start
	private final int[] elements;
	private final int max;             // final element in array
	
	public IntArrayIterator(int[] values, int maxIndex) {
		elements = values;
		max = maxIndex;
	}

	public boolean hasNext() {
		return nextElement < max;
	}

	public Integer next() {
		return elements[nextElement++];  // Pick out and increase
	}		
}
