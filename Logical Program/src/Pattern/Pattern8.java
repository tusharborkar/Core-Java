package Pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int z = 1;

		for (int i = 1; i <= 5; i++) {

			for (int j = 5 - 1; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= z; k++) {
				System.out.print("*");
			}
			z++;
			System.out.println();
		}

	}
}
