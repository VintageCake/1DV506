package ls223qx_lab4.nyhetsbyra;

public class Nyhet {
	int originId;
	private String content;
	private static int idCounter = 100; // Separates the identifier numbers for the papers and the individual news.
	private final int id;

	public Nyhet(String n, Tidning t) {
		idCounter++;
		id = idCounter; // Identifier integer assignment and increment.
		content = n;
		originId = t.getId(); // Keep track of what paper created this piece of news.
	}
	public String getContent() {
		return content;
	}
	public int getId() {
		return id;
	}
	public int getOrigin() { // Return the integer ID of the original creator of news.
		return originId;
	}
	public void modifyNews(String newContent) {
		content = newContent;
	}
}
