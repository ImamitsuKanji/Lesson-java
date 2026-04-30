package jp.co.aforce.sample.exercise.OverLoad;

public class Chapter10question1 {
	int n1;
	int n2;
	int n3;

	public Chapter10question1() {
		int n1;
		int n2;
		int n3;
	}

	void addTwo(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	void addThree(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}

	public static void main(String[] args) {
		Chapter10question1 c = new Chapter10question1();
		c.addTwo(2, 3);
		c.addThree(4, 5, 6);

	}

}
