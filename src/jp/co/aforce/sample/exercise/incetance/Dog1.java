package jp.co.aforce.sample.exercise.incetance;

public class Dog1 {
	public void showName(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		dog.showName("ポチ");
	}
}
