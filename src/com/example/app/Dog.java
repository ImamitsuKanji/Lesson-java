package com.example.app;

public class Dog {
	String name;
	String color;
	String size;
	
	public Dog() {
		String name;
		String color;
		String size;
	}
	
	public void introduce(String name, String color, String size) {
		System.out.println("この犬の犬種は" + name + "です。\nこの犬は" + color + "の" + size + "犬です。");
	}

}
