package jp.co.aforce.sample.exercise.Cast;

public class Rectangle implements Shape{
	double height = 0;
	double width = 0;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return height * width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}	

}
