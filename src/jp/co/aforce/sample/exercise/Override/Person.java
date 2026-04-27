package jp.co.aforce.sample.exercise.Override;

public class Person{

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	
	@Override
	public String toString() {
		return "名前:" + name +
				"年齢:" + age;
	}
	
	public static void main(String[] args) {
		Person person = new Person("kanji", 20);
		System.out.println(person);

	}

}
