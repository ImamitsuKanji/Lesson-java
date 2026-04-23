package jp.co.aforce.sample.exercise;

public class Exercise2 {

	public static void main(String[] args) {
		{
			System.out.println("問4");
			double num = 4.5;
			System.out.println(num / 2);
		}

		{
			System.out.println("問5");
			double num = 7.8;
			System.out.println((int) num);
			System.out.println(num - (int) num);
		}

		{
			System.out.println("問6");
			double num = 3.2;
			System.out.println(num * 10);
		}

		{
			System.out.println("問7");
			int num = 0;
			System.out.println(num == 0);
		}

		{
			System.out.println("問8");
			int num = -5;
			System.out.println(num < 0);
		}

		{
			System.out.println("問9");
			int num = 15;
			System.out.println(num % 5 == 0);
		}

		{
			System.out.println("問10");
			int num1 = 8;
			int num2 = 3;
			System.out.println(num1 + num2);
		}

		{
			System.out.println("問11");
			int num1 = 10;
			int num2 = 4;
			System.out.println(num1 - num2);
		}

		{
			System.out.println("問12");
			int num1 = 6;
			int num2 = 7;
			System.out.println(num1 * num2);
		}

		{
			System.out.println("問13");
			String name = "今満貫志";
			int age = 20;
			age++;
			String msg = String.format("%Sは次の誕生日で%dです。", name, age);
			System.out.println(msg);
		}

		{
			System.out.println("問14");
			int num1 = 8;
			int num2 = 3;
			System.out.println(num1 + num2);
			System.out.println(num1 - num2);
			System.out.println(num1 * num2);
			System.out.println(num1 / num2);
			System.out.println(num1 % num2);
		}

		{
			System.out.println("問15");
			int test1 = 75;
			int test2 = 88;
			int test3 = 92;
			System.out.println(test1 + test2 + test3);
			System.out.println((test1 + test2 + test3) / 3);
			System.out.println((int) (test1 + test2 + test3) / 3);
		}

		{
			System.out.println("問16");
			System.out.println((int) (12000 - (12000 * 0.3)));
		}

		{
			System.out.println("問17");
			System.out.println("false");
		}

		{
			System.out.println("問18");
			System.out.println("false");
		}

		{
			System.out.println("問19");
			System.out.println("false");
		}

		{
			System.out.println("問20");
			System.out.println("割引対象です");
		}
	}

}
