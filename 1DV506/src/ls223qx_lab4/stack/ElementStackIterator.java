package ls223qx_lab4.stack;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ElementStackIterator implements Iterator<Object> { // Pretty much stolen from the 2015 lecture by Jonas Lundberg lecture on Youtube: youtu.be/3qcPoYAMlcU?t=2162
	private int nextElement = 0;
	private final Object[] elements;
	private final int max;
	
	public ElementStackIterator(Object[] values, int size) { // Constructor takes the array values and the size of valid numbers, which do not have to be the same as the array length.
		elements = values;
		max = size;
	}
	
	public boolean hasNext() { // Makes sure the iterator index stops at the last valid number, or at the specified
		return nextElement < max; 
	}
	public Object next() {
		if (!hasNext()) {
			throw new NoSuchElementException("No more elements to grab!");
		}
		return elements[nextElement++]; // Return elements[nextElement] and then add one to the counter-
	}

}
