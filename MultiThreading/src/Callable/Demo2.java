package Callable;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo2 {

	public static void main(String[] args) {
		
		ExecutorService executor= Executors.newCachedThreadPool();
		
		Future< Integer> future=executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
			System.out.println("running....");
			Thread.sleep(2000);
			System.out.println("Thread Woked");
			return null;
			}
		
		
		});executor.shutdown();
	}
	
}
