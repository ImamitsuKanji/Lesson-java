package jp.co.aforce.sample.exercise.Cast;

public class Dog extends Animal{

	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = (Dog)animal; 
		
		dog.intorduceInf("ポチ", 0);

	}

}
