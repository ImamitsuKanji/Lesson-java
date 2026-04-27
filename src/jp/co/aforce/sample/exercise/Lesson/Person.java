package jp.co.aforce.sample.exercise.Lesson;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("名前は" + name + "です。年齢は" + age + "歳です。");
	}
}
