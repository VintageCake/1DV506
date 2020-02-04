package ls223qx_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Tidning {
	private Nyhetsbyro affiliatedAgency;
	private ArrayList<Nyhet> newsList = new ArrayList<>();
	private ArrayList<Nyhet> bufferList = new ArrayList<>();

	private static int idCounter = 0;
	private int id;
	private boolean registered = false;

	public Tidning() {
		idCounter++;
		id = idCounter;
	}

	public int getId() {
		return id;
	}

	public void generateNews(String news) { // Create a new news object from an input string, adds the object to the
												// unpublished news list.
		Nyhet n = new Nyhet(news, this);
		bufferList.add(n);
		System.out.println("Paper: " + id + " Added news, ID: " + n.getId());
	}
	public void pushUrgent(String nyhet) { // Pushes a news object to the local list and the news agency.
		Nyhet n = new Nyhet(nyhet, this);
		newsList.add(n);
		this.pushNews(n);
	}

	public void pushUnpublished() { // Push all unpublished news (bufferList) to the news agency.
		if (!registered) {
			throw new IllegalArgumentException("Paper is not registered with an agency!");
		}
		else {
			for (int i = 0; i < bufferList.size(); i++) {
				newsList.add(bufferList.get(i));
				this.pushNews(bufferList.get(i));
			}
			bufferList.clear(); // Clears the buffer list.
		}
	}

	public void recieveNews(Nyhet news) { // Receives news from agency
		System.out.println("Paper ID: " + id + " Got news ID: " + news.getId());
		newsList.add(news);
	}

	public void registerToAgency(Nyhetsbyro n) { // Registers the paper to a news agency.
		if (!registered) {
			affiliatedAgency = n;
			n.registerPaper(this);
			registered = true;
		}
		else
			throw new IllegalArgumentException("Already registered");
	}

	public void listNews() { // Print all news in the local news storage.
		for (int i = 0; i < newsList.size(); i++) {
			System.out.println(newsList.get(i).getContent());
		}
		System.out.println();
	}
	public void listUnpublished() {
		for (int i = 0; i < bufferList.size(); i++) {
			System.out.println(bufferList.get(i).getContent());
		}
		System.out.println();
	}

	private void pushNews(Nyhet news) { // Pushes a single piece of news to a news agency, private helper method.
		System.out.println("Paper ID: " + id + " Pushed news ID: " + news.getId());
		affiliatedAgency.masterRecieveNews(news, this);
	}

}
