package Trim;

public class ReplaceAll {
	
	public static void main(String[] args) {
		
		
		String s = "    tu    shar bor      kar pu   ne      ";
		
		String withoutString =s.replaceAll("\\s", "");
		
		System.out.println(withoutString);
		
		
	}

}
