package ls223qx_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Nyhetsbyro {
	private ArrayList<Tidning> regPapers = new ArrayList<>(); // Keeps track of registered newspapers.
	private ArrayList<Nyhet> masterNewsList = new ArrayList<>();

	public Nyhetsbyro() {
		//Empty constructor, no need for field initialisation.
	}

	public void registerPaper(Tidning t) { // Registers a paper with this agency
		if (regPapers.contains(t))
			throw new IllegalArgumentException("Paper already registered");
		else
			regPapers.add(t);
	}

	public void masterRecieveNews(Nyhet n, Tidning t) { // Adds the news object to the master news storage, also pushes the news to the other papers registered.
		masterNewsList.add(n);
		for (int i = 0; i < regPapers.size(); i++) {
			if (regPapers.get(i).getId() != t.getId())
				this.pushNews(n, regPapers.get(i));
		}

	}
	public ArrayList<Nyhet> requestMasterCopy() { // Unused, returns a copy of the master news list.
		ArrayList<Nyhet> n = new ArrayList<>();
		for (int i = 0; i < masterNewsList.size(); i++ ) {
			n.add(masterNewsList.get(i));
		}
		return n;
	}
	private void pushNews(Nyhet n, Tidning t) {  // Pushes a piece of news to a papers local news storage. Private helper method.
		t.recieveNews(n);
	}

}
