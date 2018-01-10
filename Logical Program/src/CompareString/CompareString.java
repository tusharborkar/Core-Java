 package CompareString;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		Scanner  scanner= new Scanner(System.in);
		System.out.println("enter the first String");
		String s1=scanner.nextLine();
		
		System.out.println("enter the second string");
		String s2= scanner.nextLine();
		
	
		if (s1.compareTo(s2)>0) {
			System.out.println("first string is greater than second string ");
			
		} else if(s1.compareTo(s2)<0){

			System.out.println("Second string  is greater than first string");
		}else {
			System.out.println("both string are equal");
		}

		
		

		
	}
}
