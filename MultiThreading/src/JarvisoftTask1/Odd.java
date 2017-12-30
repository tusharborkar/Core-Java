package JarvisoftTask1;

public class Odd implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
