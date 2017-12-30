package JarvisoftTask1;

public class MyThreadPriority extends Thread {

	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println(t1.currentThread().getName());

		t1.setPriority(5);
		System.out.println(t1.getPriority());

		t1.setName("main thread create");
		System.out.println(t1.getName());
		t1.setPriority(6);
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());
		System.out.println(t1.getClass());
		System.out.println(t1.getState());
		System.out.println(t1.isAlive());

	}

}
