package SynchronizedMethod;

public class A {

	/*synchronized*/ public void show(int n) {
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);
			}
		}
	}
}
