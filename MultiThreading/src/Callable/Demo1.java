package Callable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo1 implements Callable {
	@Override
	public Object call() throws Exception {
		Thread.sleep(2000);
		return Thread.currentThread().getName();

	}

	public static void main(String[] args) {
		// Get ExecutorService from Executors utility class, thread pool size is
		// 10
		ExecutorService executor = Executors.newFixedThreadPool(10);
		// create a list to hold the Future object associated with Callable
		List<Future<String>> list = new ArrayList<Future<String>>();
		// Create Demo1 instance
		Callable<String> callable = new Demo1();
		for (int i = 0; i < 100; i++) {
			// submit Callable tasks to be executed by thread pool
			Future<String> future = executor.submit(callable);
			// add Future to the list, we can get return value using Future
			list.add(future);
		}
		for (Future<String> fut : list) {
			try {
				// print the return value of Future, notice the output delay in
				// console
				// because Future.get() waits for task to get completed
				System.out.println(new Date() + "::" + fut.get());
			} catch ( Exception e) {
				e.printStackTrace();
			}
		}
		// shut down the executor service now
		executor.shutdown();
	}
}
