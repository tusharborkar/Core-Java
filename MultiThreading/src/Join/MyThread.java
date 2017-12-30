package Join;

public class MyThread implements Runnable {

	@Override
	public void run() {
	
		for (int i = 0; i <= 10; i++) {
			System.out.println("child thread join" + i);
			
		}

	}

	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		t.start();
		/*t.start();*/
try {
	t.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		for (int i = 0; i <= 10; i++) {
			System.out.println("main thread join" + i);
		}

	}

}
