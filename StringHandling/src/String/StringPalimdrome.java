package String;

import java.util.Scanner;

public class StringPalimdrome {
	
	public static void main(String[] args) {
		
		String original,reverse="";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the string");
		original =scanner.next();
		
		/*int length=original.length();
		*/
		for (int i = original.length()-1; i >0; i--) {
			
			reverse=reverse+original.charAt(i);
			
		}
		if (reverse.equals(reverse)) {
			System.out.println("string is palindrome");
		} else {

			System.out.println("string is not paliindrome");
		}
		
	}

}
