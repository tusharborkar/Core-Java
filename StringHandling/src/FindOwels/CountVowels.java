package FindOwels;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		
		int count = 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the string");
		String s=scanner.nextLine();
		
		
	
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i)=='a' ||(s.charAt(i)=='e' ||s.charAt(i)=='i')){
				System.out.println(s.charAt(i));
			}
			
			String[] s1=s.split("aeiou");
			
			count =count+1;
			System.out.println(count);
		}
	
		
	
		
		
	}

}
