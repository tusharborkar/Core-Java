package ReverseString;

import java.util.Scanner;

public class A {

	
	public static void main(String[] args) {
		
		String a="Siva";

		 for(int i=0;i<=a.length()-1;i++)
		 {
		     System.out.print(a.charAt(i));
		 }
		     System.out.println("");

		 for(int i = a.length() - 1; i >= 0; --i)
		 {
		     System.out.print(a.charAt(i)); 
		 }
		
		
		
	}
}
