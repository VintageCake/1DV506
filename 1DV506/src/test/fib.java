package test;

public class fib {
	public static void main(String[] args) {
		int[] test = {1,2,3};
		System.out.println(fibb(50));
		
		System.out.println(multiply(5,5));
		printForward(test,0);
		System.out.println();
		printBackward(test, test.length-1);
		System.out.println();
		printBackwardSmart(test, 0);
	}
	
	public static int fibb(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return fibb(n-1)+fibb(n-2);
		}
	}
	
	public static int multiply(int a, int b) { // a X b
		if (b == 1) {
			return a;
		}
		else {
			return a + multiply(a, b-1);
		}
		
	}
	public static void printForward(int[] a, int n) {
		if (n != a.length) {
			System.out.println(a[n]);
			printForward(a, n+1);
		}
	}
	public static void printBackward(int[] a, int n) {
		if (n>=0) {
			System.out.println(a[n]);
			printBackward(a, n-1);
		}
	}
	public static void printBackwardSmart(int[] a, int n) {
		if (n != a.length) {
			printBackwardSmart(a, n+1);
			System.out.println(a[n]);
		}
	}

}
