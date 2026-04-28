package jp.co.aforce.sample.exercise.OverLoad;

public class Rectangle {
	int height;
	int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(int width) {
		this.width = width;
		this.height = width;
	}

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(3, 3);
		Rectangle rectangle2 = new Rectangle(10);
		System.out.println(rectangle1.height * rectangle1.width);
		System.out.println(rectangle2.height * rectangle2.width);

	}

}
