package String;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String  original ,reverse="";
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("please enter the string");
	     original=scanner.next();
		
	     for (int i =original.length()-1; i >=0; i--) {
			
	    	 reverse=reverse+original.charAt(i);
	    	 
		}
		if (reverse.equals(original)) {
			System.out.println("palindrome");
		} else {

			System.out.println("not palindrome");
		}
		
		
		
		
	}
}
