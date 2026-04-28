package jp.co.aforce.sample.exercise.anonymousclass;

public class Chapter10Anonymousclass implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello, World!");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Chapter10Anonymousclass());
		t.start();

	}

}
