package ls223qx_lab4;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateRandomTempFile { // This class generates a file with random numbers in the C:\Temp folder, if this folder doesn't exit - the program exits.
	// This method was used as an input file for Histogram.java
	public static void main(String[] args) {
		File file = new File("C:\\Temp\\heltal.dat");
		Random rand = new Random();
		
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		else {
			try {
				if (file.createNewFile()) {
					System.out.println("Generating random file");
					PrintWriter output = new PrintWriter("C:\\Temp\\heltal.dat");
					for (int i = 0; i < 50; i++) {
						if (i % 2 == 0) {
							output.println(rand.nextInt(150));
						}
						else {
							output.println(-rand.nextInt(150));
						}
					}
					output.close();
				}
				
			}
			catch (IOException ex) {
				System.err.println("Something went wrong, it is likely that the folder does not exist");
				ex.printStackTrace();
			}

		}
	}
}