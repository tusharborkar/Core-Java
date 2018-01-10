package String;

public class ReverseString1 {
	
	public static void main(String[] args) {
		
		String original ="hello world";
		String reverse="";
		
		int length=original.length();
	
		for (int i =length-1; i >=0; i--) {
			reverse=reverse+original.charAt(i);
			
		}

		System.out.println(reverse);
		
	}

}
