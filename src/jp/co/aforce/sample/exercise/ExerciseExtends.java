package jp.co.aforce.sample.exercise;

import jp.co.aforce.sample.exercise.classBasics.Person2;

public class ExerciseExtends {

	public static void main(String[] args) {
		{
			System.out.println("問１");
			System.out.println("親クラスから機能を引き継ぎを行う機能");
		}

		{
			System.out.println("問３");
			System.out.println("C");
		}
		
		{
			System.out.println("問４");
			System.out.println("A");
		}
		
		{
			System.out.println("問４");
			System.out.println("C");
		}
	}
}

class Person {
	void person() {
		System.out.println("問２-①");
		String name;
		int age;
	}
}

class Student extends Person2 {
	public Student(String name, int age) {
		super(name, age);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void person() {
		System.out.println("問２-②");
		String name;
		int age;
	}

	String studentId;
}