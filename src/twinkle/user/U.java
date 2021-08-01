package twinkle.user;

public class U {
	public static void main(String[] args) {
		try {
			m();
		} catch (Exception e) {
			System.out.println("H");
		} finally {
			System.out.println("I");
		}
	}
	

	static void m() {
		try {
			w();
			System.out.println("J");
		} catch (ArithmeticException e) {
			System.out.println("K");
		} finally {
			System.out.println("L");
		}
		System.out.println("M");
	}

	static void w() {
		throw new NullPointerException();
	}
}
