package test;
import java.util.Scanner;
public class printPositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N of integers: ");
		int nIntegers = sc.nextInt();
		
		int[] integerArray = new int[nIntegers];
		for (int i = 0; i < nIntegers; i++) {
			integerArray[i] = sc.nextInt();
			System.out.println("number" + (i+1) + " :" + integerArray[i]);
		}
		System.out.print("pos n "); 
		for (int i = 0; i < nIntegers; i++) {
			if (integerArray[i] > 0) {
				System.out.print(integerArray[i] + " ");
			}
		}
		sc.close();
		
	}

}
