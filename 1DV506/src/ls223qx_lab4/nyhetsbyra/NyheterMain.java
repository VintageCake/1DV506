package ls223qx_lab4.nyhetsbyra;
/*
 * Create some example papers, pushes some small pieces of news to a simulated agency and shows that the other papers also receive the news objects.
 */
public class NyheterMain {
	public static void main(String[] args) {
		Tidning EX = new Tidning(); // Create some example paper objects.
		Tidning EA = new Tidning();
		Tidning ET = new Tidning();
		
		Nyhetsbyro TT = new Nyhetsbyro(); // Create one agency object.
		
		EX.registerToAgency(TT); // Register all the papers to the agency.
		EA.registerToAgency(TT);
		ET.registerToAgency(TT);
		
		EX.listNews(); // List the current news list of the first paper, which is empty.
		
		EX.generateNews("Test1"); // Generate three pieces of news, belonging to the EX paper.
		EX.generateNews("Test2");
		EX.generateNews("Test3");
		
		EX.listNews(); // List the news arrays from all papers, will all be empty. The generated news are only present in the unpublished news array.
		EA.listNews();
		ET.listNews();
		
		EX.listUnpublished(); // Print unpublished news.
		
		EX.pushUnpublished(); // Pushes the unpublished news to the news agency, along with pushing it to its own local news array.
		
		EX.listNews(); // Lists the news arrays for each paper, which have all been filled with the same content.
		EA.listNews();
		ET.listNews();
		
		EX.pushUnpublished(); // Does nothing
		
		EA.pushUrgent("Generate and push a new news object with this string as content");
		ET.listNews(); // Shows that the other papers received the 'urgent' piece of news.
		
	}

}
