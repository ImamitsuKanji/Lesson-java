package jp.co.aforce.sample.exercise.Cast;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Circle(3.0);
		
		if(shape instanceof Circle c) {
			System.out.println("面積の半径:" + c.getRadius());
			System.out.println("面積:" + (int)(c.getArea()));
		}
		else if(shape instanceof Rectangle r) {
			System.out.println("高さ;" + r.getHeight());
			System.out.println("幅:" + r.getWidth());
			System.out.println("面積:" + (int)(r.getArea()));
		}

	}

}
