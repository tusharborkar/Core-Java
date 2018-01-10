package EqualIgnoreCase;

public class EqualIgnoreCase {
	public static void main(String[] args) {
		
		String s1 = "core java";
		String s2 = "CORE java";
		String s3 = "core JAVA";
		String s4 = "CORE JAVA";
		String s5 = "core java";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equalsIgnoreCase(s5));
		
	}

}
