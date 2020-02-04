package ls223qx_lab4.stack;

import java.util.Iterator;

public class StackMain {
	public static void main(String[] args) {
		Stack stack1 = null; // Declaring a stack object
		Object[] thingy = {10,11,12,13,14};
		stack1 = new ElementStack(thingy); // Assign stack object as an elementStack and give values.
		
		System.out.println(stack1.peek() + " Peeking" + "\n"); // Peek at the top value
		
		while (!stack1.isEmpty()) { // Pop all elements
			System.out.println("Size: " + stack1.size());
			System.out.println("Popped: " + stack1.pop());
		}
		
		System.out.println(); // Output padding
		
		for (int i = 0; i < 10; i++) { // Push 10 integers
			stack1.push(i);
		}
		while (!stack1.isEmpty()) { // Pop all objects until empty
			System.out.println(stack1.pop());
		}
		
		System.out.println(); // Padding
		
		Object[] thingy2 = {"example", 3, 9, 3.56, 9, "hello"}; // Testing different kinds of variables
		Stack stack2 = new ElementStack(thingy2);
		
		Iterator<Object> stackIterator = stack2.iterator(); // Testing the iterator function
		while (stackIterator.hasNext()) {
			System.out.println(stackIterator.next());
		}
		System.out.println(); // Padding
		
		Stack stack3 = new ElementStack(); // Testing an empty object stack
		
		
		try {
			stack3.pop(); // Attempting to pop an empty stack
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		stack3.push(1); // Pushing values to an empty stack
		stack3.push(2);
		stack3.push(3);
		while(!stack3.isEmpty()) { // Pop all values.
			System.out.println(stack3.pop());
		}

	}
}
