package PalindromeString;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String original, reverse="";
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the string");
		 original =scanner.next();
		
		int length =original.length();
		
		for(int i=length-1;i>=0;i--){
			reverse= reverse+original.charAt(i);
			
		}
		if (original.equals(reverse)) {
			System.out.println("enter String is palindrome");
		} else {

			System.out.println("enter String is Not Palindrome");
		}
			
		
		
	}
}
