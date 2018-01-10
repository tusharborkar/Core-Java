package Count;

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string");
		String s=scanner.next();


		String[] w=s.split("tushar");
		for (int i = 0; i < w.length; i++) {

		count	=count+1;
			
		}
		
		
		System.out.println(count);
		
		
	}

}
