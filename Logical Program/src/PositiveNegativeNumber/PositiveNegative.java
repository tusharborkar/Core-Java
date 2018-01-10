package PositiveNegativeNumber;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("please enter the number");
		int x = scanner.nextInt();
		
		if (x==0) {
			System.out.println("please enter the non zero number ");
		} else if(x<0){
			System.out.println("the number is negative");

		}else if(x>0) {
			System.out.println("the number is positive");
		}else {
			System.out.println("invalid number");
		}
		
	}

}
