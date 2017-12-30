package Priority;

public class Test {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(4);
		System.out.println();

		MyThread t = new MyThread();
		t.getPriority();
		System.out.println(t);

	}
}
