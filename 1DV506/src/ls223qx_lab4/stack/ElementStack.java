package ls223qx_lab4.stack;

import java.util.Arrays;
import java.util.Iterator;
// ObjectStack might have been a better name.
public class ElementStack implements Stack { 
	private int size;
	private Object[] values = {null}; // In case of call with empty parameter, makes sure that this array still has a null element on the top.

	private int currentIndex = 0; // This variable should always be the index pointing at a NULL value in the object array.

	public ElementStack(Object[] input) {
		input = Arrays.copyOf(input, input.length + 1);
		values = input;
		currentIndex = values.length - 1;
		updateSize(); // Set size integer
	}

	public ElementStack() { // Empty constructor
		
	}

	public void push(Object element) { // Push an element to the stack, update the global iterator.
		makeLarger(); // Resize array
		values[currentIndex] = element;
		currentIndex++;
		updateSize(); // Update the size variable
	}

	public Object pop() { // Pop off the value at the top, discarding it.
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty!");
		}
		Object poppedValue = values[currentIndex - 1];
		if (currentIndex != 0) { // Makes sure that the index never goes below 0.
			currentIndex--;
		}
		makeSmaller();
		updateSize();
		return poppedValue;
	}

	public Object peek() { // Peek at the value on the top, without modifying it.
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty!");
		}
		return values[currentIndex - 1];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() { // Simply returns true if the designated size is 0.
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	public Iterator<Object> iterator() { // Returns an iterator object that takes its structure from a self-made class.
		return new ElementStackIterator(values, size);
	}
	
	// Private helper methods below
	
	private void makeLarger() {  // Enlarges the array by one, the extra space will be assigned null with this method.
		values = Arrays.copyOf(values, values.length + 1);
	}

	private void makeSmaller() { // Shrinks the array, removing the top value (the one 'below' null) and replacing it with a null value
		if (values.length > 1) {
			values = Arrays.copyOf(values, values.length - 1);
		}
		values[currentIndex] = null;
	}

	private void updateSize() { // Updates size, based on length.
		size = values.length - 1; // Because the last null value isn't an 'actual' element, the size will be one less than the private object array.
	}

}
