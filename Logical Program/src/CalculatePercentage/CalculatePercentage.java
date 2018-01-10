package CalculatePercentage;

import java.util.Scanner;

public class CalculatePercentage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number:");
		double a =scanner.nextDouble();
		
		System.out.println("enter the second number: ");
		double b =scanner.nextDouble();
		
		double c=a%b;
		System.out.println("total percentage is : "+c);
	}

}
