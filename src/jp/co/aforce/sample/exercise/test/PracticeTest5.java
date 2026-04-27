package jp.co.aforce.sample.exercise;

public class PracticeTest5 {

	public static void main(String[] args) {
		int r = new java.util.Random().nextInt();
		int fortune = r;

		switch (fortune) {
		case 1: {
			System.out.println("吉です");
			break;
		}
		case 2: {
			System.out.println("中吉です");
			break;
		}
		case 3: {
			System.out.println("大吉です");
			break;
		}
		default:
			System.out.println("凶です");
		}

		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i + ",");
			}
		}

		int num1 = 1;
		int num2 = 1;
		int number = 0;

		for(int i;i) {
			 

		}

	}

}
