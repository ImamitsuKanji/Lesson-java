package jp.co.aforce.sample.exercise.Cast;

public class Circle implements Shape{
	double radius = 0;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

}
