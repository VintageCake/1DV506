package test;

public class Test1 {
	public static void main(String[] args) {
		try {
			method();
			System.out.println("After the method call");
		}
		catch (ArithmeticException ex ) {
			System.out.println("Division by zero");
		}
		catch (RuntimeException ex) {
			System.out.println("Test");
			ex.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Generic exception");
		}
	}
	static void method() throws Exception {
		try {
			String s ="abc";
			
			System.out.println(s.charAt(3));
		}
		catch (RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("Runtime exception");
		}
		catch (Exception ex) {
			System.out.println("Generic");
		}
	}

}
