package jp.co.aforce.sample.exercise;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] arges) {
		//問1.
		System.out.println("問1");
		int num = 10;
		System.out.println(num);
		//問2
		System.out.println("問2");
		int a = 8;
		int b = 5;
		int sum = a + b;
		System.out.println(sum);
		//問3
		System.out.println("問3");
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println(area);
		//問4
		System.out.println("問4");
		String name = "java";
		double version = 17.0;
		boolean isFun = true;
		//問5
		System.out.println("問5");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("名前を入力してください。");
		String names = scanner.nextLine();
		
		System.out.println("こんにちは" + names);
		
		scanner .close();
		//問6
		System.out.println("問6");
		int age = 20;
		String birthday = "2005-05-15";
		
		String msg = String.format("名前:%s年齢%d:誕生日:%s",names, age, birthday);
		System.out.println(msg);
		//問7
		System.out.println("問7");
		String itemName = "体重計";
		int praice = 2000;
		int count = 5;
		int total = praice * count;
		
		String log = String.format("商品%sは、価格%dなので、%d個買うと%d円です。", itemName, praice, count, total);
		System.out.println(log);
		//問8
		System.out.println("問8");
		System.out.println(-45);
		//問9
		System.out.println("問9");
		System.out.println(1);
		//問10
		System.out.println("問10");
		System.out.println("B,D");
		//問11
		System.out.println("問11");
		System.out.println(5);
		//問12
		System.out.println("問12");
		System.out.println(100);
		//問13
		System.out.println("問13");
		System.out.println(9);
		//問14
		System.out.println("問14");
		System.out.println("×");
		System.out.println("値が入っていないnullの状態で出力することはできないため");

	}

}
