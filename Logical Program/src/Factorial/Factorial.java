package Factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		int fact=1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number which u want factorial number");
		int a = scanner.nextInt();
		
		if (a==0) {
			System.out.println("enter non-zero numbar");
		} else {

			for(int c =1;c<=a;c++){
				 fact=fact*c;
				System.out.println(fact);
				
	}
			
			
		}
		
		
	}

}
