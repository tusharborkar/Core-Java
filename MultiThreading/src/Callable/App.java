package Callable;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> future = executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {

				Random random = new Random();
				int duration = random.nextInt(4000);
				System.out.println("starting....");
				Thread.sleep(2000);
				if (duration > 2000) {
					System.out.println("Running");
				} else {

					throw new IOException("It takes too long time");
				}
				System.out.println("finished...");
				return duration;
			}
		});
		executor.shutdown();
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (ExecutionException e) {

			e.printStackTrace();
		}
	}

}
