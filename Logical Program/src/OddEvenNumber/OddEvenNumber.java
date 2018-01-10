package OddEvenNumber;

import java.util.Scanner;

public class OddEvenNumber {
	
	public static void main(String[] args) {
		
		int i;
		System.out.println("please enter the number "); 
		 
		Scanner scanner = new Scanner(System.in);
		i=scanner.nextInt();
		
		if(i%2==0){
			
			System.out.println("the number is even");
		}else {
			System.out.println("the number is odd");
		}
		

	
	}

}
