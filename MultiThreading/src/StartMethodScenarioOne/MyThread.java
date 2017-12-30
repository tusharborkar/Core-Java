// Dont override start() if we override then it is called as a normal method
// if u want to override then dont go for threding concept



package StartMethodScenarioOne;

public class MyThread extends Thread {

	public void run() {
		System.out.println("run method");
	}
	public void start() {
		System.out.println("start method");
	}
}
