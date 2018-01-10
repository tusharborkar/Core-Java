package ReverseString;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter String");
		String s = scanner.next();

		for (int i = 0; i < s.length() - 1; i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println(" ");
		for (int i = s.length() - 1; i >=0; --i) {
			System.out.println(s.charAt(i));
		}

	}

}
