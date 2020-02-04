package ls223qx_lab4.sorter_orter;

public class Ort implements Comparable<Ort> {
	
	private int zipCode;
	private String name;
	
	public Ort(int zip, String ort) { // Constructor takes values directly
		zipCode = zip;
		name = ort;
	}
	public int getNumber() { 
		return zipCode;
	}
	public String getName() {
		return name;
	}
	public String getFull() { // getName and getNumber are fine to use, but this method saves some typing in the main method.
		return zipCode + " " + name;
	}
	public int compareTo(Ort o) { // Compares zip codes between objects, essential for the sort method.
		return Integer.compare(zipCode, o.getNumber());
	}

}
