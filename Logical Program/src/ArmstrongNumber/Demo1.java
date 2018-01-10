package ArmstrongNumber;

import java.util.Scanner;

public class Demo1 {

	
	public static void main(String[] args) {
		int a , arm = 0,d;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int no=scanner.nextInt();
	d=no;
	
	while(no>0){
		
	
	a=no%10;
	no=no%10;
	arm=arm+a*a*a;
	}
		
		
		
		
	}
}
