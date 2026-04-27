package jp.co.aforce.sample.exercise.classBasics;

public class Circle {
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	void math(int radius){
		System.out.println(Math.PI * radius * radius);
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.math(10);

	}

}
