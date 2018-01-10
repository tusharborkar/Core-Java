package String;

import java.util.Scanner;

public class ReverseString2 {
	
	public static void main(String[] args) {
		
		String original,reverse="";
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the string");
		original=scanner.next();
		
	
		
		for (int i =original.length()-1;i>=0; i--) {
			
			reverse=reverse+original.charAt(i);
			
		}
		System.out.println(reverse);
		
		
	}

}
