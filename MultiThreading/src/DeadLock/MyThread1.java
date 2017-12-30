package DeadLock;

public class MyThread1 extends Thread {

	@Override
	public void run() {

		synchronized (Integer.class) {
			System.out.println("Integer class");

			synchronized (String.class) {
				System.out.println("String class");
			}
		}

	}

}