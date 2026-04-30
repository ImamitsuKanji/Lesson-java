package jp.co.aforce.sample.exercise.StaticMethodPractice;

public class MathUtils {
	int num1;
	int num2;
	
	static int add(int num1, int num2){
		return num1 + num2;
	}
	
	void mathShow(int total) {
		System.out.println("今回の和は" + total + "です。");
	}

	public static void main(String[] args) {
		MathUtils mathUtils = new MathUtils();
		mathUtils.mathShow(MathUtils.add(1, 2));

	}

}
