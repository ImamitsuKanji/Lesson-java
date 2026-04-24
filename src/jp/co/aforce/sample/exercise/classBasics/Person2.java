package jp.co.aforce.sample.exercise.classBasics;

public class Person2 {
	
	String name;
	int age;
	
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person2 person = new Person2("kanji", 0);
		System.out.println(person.name + "" +person.age);
	}
}
