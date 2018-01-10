package AdditionWithoutPlusOperator;

import java.math.BigInteger;

public class Addition {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		BigInteger c = new BigInteger(Integer.toString(a));
		
		BigInteger d = new  BigInteger(Integer.toString(b));
		
		System.out.println(c.add(d));
		
	}

}
