  package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int arm=0,a,b,c,d,no;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		no=scanner.nextInt();
		d=no;
		while (no>0) {
			a=no%10;
			no=no/10;
			arm= arm+a*a*a;
			
		}
		if (arm==d) {
			System.out.println("no is armstrong");
		} else {

			System.out.println("no is not armstrong");
		}
		
		
	}

}
