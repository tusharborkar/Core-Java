package FindWordFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
int count=0;
	
	public int  name(String word , File  file) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
		    String nextToken = scanner.next();
		    if (nextToken.equalsIgnoreCase(word))
		    count++;
		}
		 
		return count++;
		
		
	}
	
	
	
}
