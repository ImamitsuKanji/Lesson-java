package jp.co.aforce.sample.exercise;

public class ExercisePolymorphism {

	public static void main(String[] args) {
		{
			System.out.println("問１");
			System.out.println("同じ処理で、違う結果を出せる仕組み");
		}

		{
			System.out.println("問３");
			System.out.println("C");
		}

		{
			System.out.println("問４");
			System.out.println("C");
		}

		{
			System.out.println("問５");
			System.out.println("C");
		}

	}

}

class Animal{
	void makeSound(){
		System.out.println("問２-①");
		System.out.println("Some sound...");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("問２-②");
		System.out.println("ワンワン！");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("問２-③");
		System.out.println("ニャーニャー！");
	}
}