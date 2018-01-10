package Pattern;

public class Pattern5 {

	
	public static void main(String[] args) {
		
		for(int i=1;i<6;i++)
		{
			for(int j=2;j<=i;j++) {
				System.out.print(" -  ");
			}for(int k=5;k>=i;k--)
			{
				System.out.print(" *  ");
			}
			
			System.out.println();
		}
		
	}
}
