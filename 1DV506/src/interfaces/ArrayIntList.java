/**
 * ArrayIntList.java
 * 22 dec 2014
 */
package interfaces;

import java.util.Iterator;

/**
 * @author jlnmsi
 *
 */
public class ArrayIntList implements IntList {

	int length = 8;
	int size = 0;
	private int[] values;

	public ArrayIntList() {
		values = new int[length];
	}

	public int size() {
		return size;
	}

	public void add(int n) {
		if (size == length)
			resize();
		values[size++] = n;
	}

	private void resize() {
		length = 2 * length;
		int[] tmp = new int[length];
		for (int i = 0; i < size; i++)
			tmp[i] = values[i];
		values = tmp;
	}

	public boolean contains(int n) {
		for (int i = 0; i < size; i++) {
			if (n == values[i])
				return true;
		}
		return false;
	}

	public int get(int pos) {
		if (pos > -1 && pos < size)
			return values[pos];
		else {
			throw new IndexOutOfBoundsException("Index out of range: " + pos);
		}
	}
	
	public Iterator<Integer> iterator() {
		return new IntArrayIterator(values,size);
	}
}
