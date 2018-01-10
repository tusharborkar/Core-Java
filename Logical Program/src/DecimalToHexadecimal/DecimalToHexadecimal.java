package DecimalToHexadecimal;

import java.util.Scanner;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int num = scanner.nextInt();
		
		/*String s = Integer.toBinaryString(num);*/
	/*	String s = Integer.toOctalString(num);*/
		String s = Integer.toHexString(num);
		
		
		System.out.println(s);
		
	}

}
