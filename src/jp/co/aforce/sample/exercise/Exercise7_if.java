package jp.co.aforce.sample.exercise;

import java.util.Scanner;

public class Exercise7_if {

	public static void main(String[] args) {
		{
			System.out.println("問１");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();

			if (num % 2 == 0) {
				System.out.println("偶数");
			} else {
				System.out.println("奇数");
			}
		}

		{
			System.out.println("問2");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();

			if (num > 0) {
				System.out.println("正です");
			} else {
				System.out.println("負です");
			}
		}
		{
			System.out.println("問3");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			if (a + b > c && b + c > a && c + a > b) {
				System.out.println("有効です");
			} else {
				System.out.println("無効です");
			}
		}
		
		{
			System.out.println("問4");
			Scanner scanner = new Scanner(System.in);
			int age = scanner.nextInt();
			
			if(age <=12) {
				System.out.println("無料です");
			}else if(age >= 60){
				System.out.println("500円です");
			}else {
				System.out.println("1000円です");
			}
		}
		
		{
			System.out.println("問5");
			System.out.println("C");
		}

	}

}
