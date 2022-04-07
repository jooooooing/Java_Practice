package Lecture_10;

public class threadPage8 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		threadPage8 main = new threadPage8();
		Thread thread = new Thread(main);
		thread.start();

	}

	public void run() {
		System.out.println("Thread");
	}

}
