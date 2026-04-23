package jp.co.aforce.sample.exercise;

public class IfPractice {

	public static void main(String[] args) {
		//if文
		int a = 50;
		int b = 50;
		if (a == b) {
			System.out.println("aとbの値は同じ");
		}

		//boolean型を使ったif文
		boolean isRainy = true;

		if (isRainy) {
			System.out.println("傘を持っていきましょう");
		}

		//else文
		int temperature = 25;

		if (temperature >= 30) {
			System.out.println("真夏日です");
		} else {
			System.out.println("真夏日ではありません");
		}

		//else if文
		int score = 75;

		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else if (score >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

		//演算子＋if文
		int time = 14;
		boolean isHoliday = false;

		if (time >= 9 && time <= 18 && !isHoliday) {
			System.out.println("勤務時間内です。");
		} else {
			System.out.println("勤務時間外です。");
		}

		//入れ子
		boolean hasLicense = true;
		boolean hasCar = true;

		if (hasLicense) {
			System.out.println("運転免許証を持っています。");
			if (hasCar) {
				System.out.println("車も持っています。");
			} else {
				System.out.println("しかし、車は持っていません。");
			}
		} else {
			System.out.println("運転免許証を持っていません。");
		}

		//Switch
		String color = "yellow";
		String message;

		switch (color) {
		case "red": {
			message = "停止してください";
			break;
		}
		case "yellow": {
			message = "注意してください";
			break;
		}
		case "green": {
			message = "進んでください";
			break;
		}
		default:
			message = "不正な信号の色です";
		}

		System.out.println("現在の信号：" + color + "-" + message);

		//while文
		int i = 0;
		while (i < 3) {
			System.out.println(i);
			i++;
		}

		//do-while
		i = 0;

		do {
			System.out.println(i);
			i++;
		} while (i < 3);

		//for文
		for (i = 0; i < 3; i++) {
			System.out.println(i);
		}

		//拡張for文
		int[] numbers = { 0, 1, 2 };
		for (int n : numbers) {
			System.out.println(n);
		}

		//
		for (i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for(int n: numbers) {
			System.out.println(n);
		}
	}

}
