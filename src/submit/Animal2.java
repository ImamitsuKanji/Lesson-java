package jp.co.aforce.sample.exercise.Override;

public class Animal
 {

	void makeSound() {
		System.out.println("動物の鳴き声");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.makeSound();
		cat.makeSound();

	}

}