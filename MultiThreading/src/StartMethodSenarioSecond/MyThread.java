package StartMethodSenarioSecond;

public class MyThread extends Thread {

	public void start() {
		super.start();
		System.out.println("strt method");
	}

	public void run() {
		System.out.println("run");
	}
}
