package PalindromeString;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class Demo1 {

	public static void main(String[] args) {
String original,reverse="";

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the String ");
		 original = scanner.next();
		 /*int length=original.length();*/
		 
	for (int i = original.length()-1; i >=0; i--) {
		reverse=reverse+original.charAt(i);
	}

	 
	 if (original.equals(reverse)) {
		System.out.println("string is palindrome");
		
	}else {
		System.out.println("String is not palindrome");
	}
	}
}
