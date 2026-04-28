package com.example.schoo;

public class Student {
	String name;
	int grade;
	
	public Student() {
		String name;
		int grade;
	}

	public void introduce(String name, int grade) {
		String introduce = String.format("名前は%sです\n学年は%d年です。", name, grade); 
		System.out.println(introduce);
	}

}
