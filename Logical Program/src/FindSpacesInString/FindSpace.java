package FindSpacesInString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpace {
	public static void main(String[] args) {
		
		String s = "tushar laxmanrao borkr";
		
	
		Pattern pattern = Pattern.compile("[AEIOUaeiou]");
		Matcher matcher = pattern.matcher(s);
		
		int count = 0;
		while (matcher.find()) {
		    count++;
		}
		System.out.println(count);
		
	}

}
