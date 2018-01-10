package LargerstNumber;

import java.util.Scanner;

public class LargerstNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a = scanner.nextInt();
		System.out.println("enter the 2nd number");
		int b = scanner.nextInt();
		System.out.println("enter the 3rd number");
		int c =scanner.nextInt();
		
		if (a>b && a>c) {
			System.out.println("1st no is greater");
		} else if(b>a && b>c){
			System.out.println("2nd number is greater");

		}else if(c>b && c>a) {
			System.out.println("3rd number is greater");
		}
		
	}

}
