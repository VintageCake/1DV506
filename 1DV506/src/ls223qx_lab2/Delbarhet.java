package ls223qx_lab2;

/*
 * 
 * Print numbers between 100 and 200 that are divisible by 4 and 5, but not by both at the same time.
 * 
 */

public class Delbarhet {
	public static void main(String[] args) {
		int rowCounter = 1;
		for (int i = 100; i <= 200; i++) { // Loops 100 through 200.
			if ((i % 4 == 0) ^ (i % 5 == 0)) {
				/*
				 * XOR '^' will return false if both are true, which fulfils the requirement of
				 * the assignment quite nicely. Mod 4 and Mod 5 returns 0 if 'i' is divisible by
				 * the respective number.
				 */
				if(rowCounter > 9) {
					System.out.println(i +" ");
					rowCounter=1;
				}
				else {
					System.out.print(i + " ");
					rowCounter++;
				}
			}
		}
	}
}
