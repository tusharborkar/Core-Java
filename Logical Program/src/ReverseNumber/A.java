package ReverseNumber;

public class A {

	public static void main(String[] args) {

		int temp;
		int no = 0;
		int a = 12345;

		while (a > 0) {

			temp = a % 10;
			a = a / 10;
			no = no * 10 + temp;

		}
		System.out.println(no);

	}

}
