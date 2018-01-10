package SimpleIntrest;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the principle amount");
		int p =scanner.nextInt();
		
		System.out.println("Please enter the rate");
		int r=scanner.nextInt();
		
		System.out.println("please the period");
		int n = scanner.nextInt();
		
		int amount =p*n*r/100;
		System.out.println("simple intrest is "+amount);
	}
}
