package jp.co.aforce.sample.exercise.incetance;

public class Rectangle {
	
	void math(int height,int width) {
		System.out.println( height * width);
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.math(10, 20);
	}

}
