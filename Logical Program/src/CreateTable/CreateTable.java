package CreateTable;

import java.util.Scanner;

public class CreateTable {
	public static void main(String[] args) {
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		 num = scanner.nextInt();
		
		 for(int i=1;i<=10;i++){

		System.out.println(num*i);
		 }
	}

}
