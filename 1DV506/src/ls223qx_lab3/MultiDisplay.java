package ls223qx_lab3;

public class MultiDisplay {
	
	private String displayMessage = "";
	private int displayCount = 0;
	
	public MultiDisplay(String input, int count) { // Constructors, 'overloaded' with an empty one as well.
		displayMessage = input;
		displayCount = count;
	}
	
	public MultiDisplay() {
		
	}
	
	public String getDisplayMessage() { // Simply returns the value of the private string, accessor
		return displayMessage;
	}
	
	public void setDisplayMessage(String inputMessage) { // Mutator for the display message.
		displayMessage = inputMessage;
	}
	
	public void setDisplayCount(int inputCount) { // Mutator for the number of times to show the message
		displayCount = inputCount;
	}
	
	public void display() { // Prints out specified message specified number of times.
		for (int i = 0; i < displayCount; i++) {
			System.out.println(displayMessage);
		}
	}
	
	public void display(String inputMessage, int inputCount) { // Can also take two argument directly, does the same thing as previous display().
		displayMessage = inputMessage;
		displayCount = inputCount;
		this.display();
	}
	
	
}
