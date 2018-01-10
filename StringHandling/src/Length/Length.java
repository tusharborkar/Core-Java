package Length;

public class Length {
	
	public static void main(String[] args) {
		
		String s= new String();
		System.out.println(s.length());
		
		char[] chars ={'a','b','c','d'};
		String s1= new String(chars);
		System.out.println(s1.length());
		
		String s2 = new String(s1+" CORE JAVA");
		System.out.println(s2);
		System.out.println(s2.length());
		
		
	}

}
