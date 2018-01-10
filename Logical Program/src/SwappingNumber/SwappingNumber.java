package SwappingNumber;

import java.util.Scanner;

public class SwappingNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a= scanner.nextInt();
		
		System.out.println("enter the 2nd number");
		int b= scanner.nextInt();
		System.out.println("before swapping : " +a +"  "+b);
		
		int swap=a;
		
		a=b;
		b=swap;
		
		System.out.println("after swapping  : " +a + "  " +b);
		
	}

}
