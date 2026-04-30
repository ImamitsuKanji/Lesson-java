package jp.co.aforce.sample.exercise.classConstructor;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void displayInfo() {
		System.out.println("名前は" + name + "です。\n年齢は" + age + "歳です。");
	}
	
	public static void main(String[] args) {
		
		Person person = new Person("kanji", 20);
		
		person.displayInfo();
	}

}
