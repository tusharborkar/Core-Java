package FindOwels;

import java.util.Scanner;

public class RemoveAllVowels {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System .in);
		System.out.println("enter the string");
		String s=scanner.nextLine();
		
		String RemoveVowels =s.replaceAll("[AEIOUaeiou]","");
		System.out.println("after removing vowels");
		System.out.println(RemoveVowels);
		
		
		
		
	}

}
