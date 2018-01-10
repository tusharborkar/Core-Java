package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int i;
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number");
		int no=scanner.nextInt();
		
		if (no==1 || no==0) {
			System.out.println("the smallest prime number is 2 ");
		}
		for (i = 2;  i<no;i++) {
			
		if (no%i==0) {
			System.out.println("the number is not prime number");
	     break;
		}
		}if (no==i) {
			System.out.println("Prime Number");
		}
		
		
	}

}
