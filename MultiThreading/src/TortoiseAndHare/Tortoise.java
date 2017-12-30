package TortoiseAndHare;

public class Tortoise extends Thread {

	@Override
	public void run() {
		
		for (int k = 1; k <101; k++) {
			System.out.println("Distance coverd by tortoise="+k);
		}
		
		System.out.println("tortoise won the race");
	}

}
