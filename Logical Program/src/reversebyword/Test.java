package reversebyword;

public class Test {
	public static void main(String[] args) {

		String string = "My name is Tushar";

		for (int i = 0; i < string.length() - 1; i++) {
			System.out.println(string.charAt(i));
		}
		System.out.println("  ****** ");
		for (int i = string.length() - 1; i >= 0; --i) {
			System.out.println(string.charAt(i));
		}
	}
}
