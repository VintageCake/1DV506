package ls223qx_lab2;

public class TartLjus {
	public static void main(String[] args) {
		boolean print = false;

		int nBoxes = 0; // Counter variables
		int totalBoxes = 0;
		int nCandles = 0;

		for (int i = 1; i <= 100; i++) { // Loop through age 1 - 100 (inclusive)
			nCandles = nCandles - i;
			
			while (nCandles < 0) { // Had wrong expression at first, (nCandles < 1) meant that even if you'd use up all the candles exactly - you'd still have to go out and buy another box.
				nBoxes++; // Keeps track of boxes for 'i' birthday
				totalBoxes++; // Keeps track of the total amount of boxes bought
				
				nCandles += 24; // adds 24 candles to the pile until nCandles turns positive
				print = true; // makes sure text only appears after you've gone out and bought some boxes
			}
			
			if (print) {
				System.out.println("Before birthday "+i+", buy " + nBoxes + " box(es).");
				print = false; // makes sure it doesn't print again after it's printed once, unless you've gone out and bought some boxes
				nBoxes = 0; // reset box variable, since it's only important for the printing process.
			}
		}
		System.out.println("Total number of boxes: " + totalBoxes +", remaining candles: " + nCandles); // Print info
	}
}
