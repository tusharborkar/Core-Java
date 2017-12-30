package TortoiseAndHare;

public class Hare {

	
	public static void main(String[] args) {
		
		Tortoise t= new Tortoise();
		t.start();
		for (int i = 1; i <51; i++) {
			System.out.println("Distance coverd by here  ="+i);
		}
		System.out.println("Hare is going to sleep");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hare is again started race");
		for (int j = 51; j<101; j++) {
			System.out.println("Distance Coverd By Hare ="+j);
		
		}
		System.out.println("Hare Has Completed th race");
	}
	
}
