package RotationString;

import Length.Length;

public class RotationString {
	
	public static void main(String[] args) {
		
		String s1 ="java";
		String s2 = "vajajava";
		
		if (s1.length()!=s2.length()) {
			System.out.println("S2 is not rotated version of S1");
		} else {

			String s3 =s1+s1;
			
			if (s3.contains(s2)) {
				System.out.println("is a rotation version ");
			} else {

				System.out.println("is not a rotation version ");
			}
			
			
		}
		
	}

}
