package ProducerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(
			10);

	public static void main(String args[]) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t1.start();
		t2.start();
		
		
		
	}

	private static void producer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			queue.put(random.nextInt(100));
		}
	}

	private static void consumer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(1000);
			if (random.nextInt(10) == 0) {
				Integer value = queue.take();
				System.out.println("time takes  " + value + " size   "
						+ queue.size());
			}
		}
	}
}
