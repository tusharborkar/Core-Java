package FibinacciSeries;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int m1=0,m2=1,m3,count=30;
		System.out.println(m1+" " +m2);
		for (int i = 2; i <= count; ++i) {
		m3=m1+m2;
		System.out.println(m3);
		m1=m2;
		m2=m3;
				
		}
		

		
		
		
		
	}
}
