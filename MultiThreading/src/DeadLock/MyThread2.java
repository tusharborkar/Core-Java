package DeadLock;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		
			synchronized (String.class) {
		System.out.println("String class");
		
		synchronized (Integer.class) {
			System.out.println("Integer class");

			}
		}
	}
}
