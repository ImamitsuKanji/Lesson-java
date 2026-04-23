package jp.co.aforce.sample.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise7_while_for {

	public static void main(String[] args) {
		{
			System.out.println("while問１");
			int num = 0;
			while (num < 10) {
				num++;
				System.out.println(num);
			}
		}

		{
			System.out.println("while問2");
			int num = 1;
			int total = 0;

			while (num <= 100) {
				total += num;
				num++;
			}

			System.out.println(total);
		}

		{
			System.out.println("while問3");
			int total = 0;

			while (true) {
				Scanner scanner = new Scanner(System.in);
				int num = scanner.nextInt();
				if (num == 0) {
					break;
				} else {
					total += num;
				}
			}

			System.out.println(total);
		}

		{
			System.out.println("do-while問１");
			int num = 0;
			do {
				num++;
				System.out.println(num);
			} while (num < 10);
		}

		{
			System.out.println("do-while問2");
			int num = 1;
			int total = 0;

			do {
				total += num;
				num++;
			} while (num <= 100);

			System.out.println(total);
		}

		{
			System.out.println("do-while問3");
			int total = 0;

			do {
				Scanner scanner = new Scanner(System.in);
				int num = scanner.nextInt();
				if (num == 0) {
					break;
				} else {
					total += num;
				}
			} while (true);

			System.out.println(total);
		}

		{
			System.out.println("for問1");
			int total = 0;
			for (int i = 0; i <= 10; i++) {
				total += i;
			}

			System.out.println(total);
		}

		{
			System.out.println("for問2");
			int total = 0;
			for (int i = 0; i <= 100; i++) {
				total += i;
			}

			System.out.println(total);
		}

		{
			System.out.println("for問3");
			int num1 = 1;
			int num2 = 0;
			int age = 0;

			for (int i = 1; i <= 10; i++) {
				System.out.println(num1);
				age = num1 + num2;
				num2 = num1;
				num1 = age;
			}
		}
		{
			System.out.println("拡張for問１");
			int[] ags = { 1, 2, 3, 4, 5, 6 };
			for (int n : ags) {
				System.out.println(n);
			}
		}
		{
			System.out.println("拡張for問2");
			List<String> stringList = new ArrayList<>();
			stringList.add("a");
			stringList.add("b");
			stringList.add("c");
			for (String n : stringList) {
				System.out.println(n);
			}
		}
		{
			System.out.println("拡張for問3");
			int total = 0;
			int[] ages = { 1, 2, 3, 4, 5 };

			for (int n : ages) {
				total += n;
			}
			System.out.println(total);
		}

		{
			System.out.println("拡張for問4");
			int[] numbers = { 1, 2, 3, 4, 5 };
			for (int n : numbers) {
				System.out.println(n);
			}
		}

		{
			System.out.println("拡張for問5");
			int[] numbers = { 1, 2, 3, 4, 5 };
			int sum = 0;
			for (int n : numbers) {
				sum += n;
			}
			System.out.println("合計:" + sum);
		}
		{
			System.out.println("拡張for問6");
			List<String> names = new ArrayList<>();
			names.add("Alice");
			names.add("Bob");
			names.add("Charlie");

			for (String n : names) {
				System.out.println(n);
			}
		}

		{
			System.out.println("break問１");
			int num = 1;
			while (num <= 10) {
				if (num == 5)
					break;
				System.out.println(num);
				num++;
			}
		}

		{
			System.out.println("break問2");
			Scanner scanner = new Scanner(System.in);
			int age = scanner.nextInt();
			int num = 1;

			while (num <= 10) {
				if (num == age)
					break;
				System.out.println(num);
				num++;
			}
		}

		{
			System.out.println("break問3");
			Scanner scanner = new Scanner(System.in);
			int age = scanner.nextInt();
			int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 } };

			outer: for (int a = 0; a < numbers.length; a++) {
				for (int i = 0; i < numbers[a].length; i++) {
					System.out.println(numbers[a][i]);
					if (numbers[a][i] == age)
						break outer;
				}
			}
		}
	}
}
