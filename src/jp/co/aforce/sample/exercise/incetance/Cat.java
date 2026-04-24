package jp.co.aforce.sample.exercise.incetance;

public class Cat {
	String name;
	
	void meow(String name) {
		System.out.println(name + "が鳴いた");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.meow("たま");
	}
}
