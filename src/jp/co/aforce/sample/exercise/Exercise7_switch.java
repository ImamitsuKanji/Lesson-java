package jp.co.aforce.sample.exercise;

import java.util.Scanner;

public class Exercise7_switch {

	public static void main(String[] args) {
		{
			System.out.println("問１");
			System.out.println("B");
		}
		
		{
			System.out.println("問2");
			System.out.println("A");
		}
		
		{
			System.out.println("問3");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			
			switch (num) {
			case 1: {
				System.out.println("日曜日");
				break;
			}
			case 2: {
				System.out.println("月曜日");
				break;
			}
			case 3: {
				System.out.println("火曜日");
				break;
			}
			case 4: {
				System.out.println("水曜日");
				break;
			}
			case 5: {
				System.out.println("木曜日");
				break;
			}
			case 6: {
				System.out.println("金曜日");
				break;
			}
			case 7: {
				System.out.println("土曜日");
				break;
			}
			default:
				System.out.println("不明な曜日です");
			}
		}
		
		{
			System.out.println("問４");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			
			switch (num) {
			case 1: {
				System.out.println(num + "月");
				break;
			}
			case 2: {
				System.out.println(num + "月");
				break;
			}
			case 3: {
				System.out.println(num + "月");
				break;
			}
			case 4: {
				System.out.println(num + "月");
				break;
			}
			case 5: {
				System.out.println(num + "月");
				break;
			}
			case 6: {
				System.out.println(num + "月");
				break;
			}
			case 7: {
				System.out.println(num + "月");
				break;
			}
			case 8: {
				System.out.println(num + "月");
				break;
			}
			case 9: {
				System.out.println(num + "月");
				break;
			}
			case 10: {
				System.out.println(num + "月");
				break;
			}
			case 11: {
				System.out.println(num + "月");
				break;
			}
			case 12: {
				System.out.println(num + "月");
				break;
			}
			default:
				System.out.println("不明な月です");
			}
		}
		
		{
			System.out.println("問5");
			Scanner scanner = new Scanner(System.in);
			String score = scanner.nextLine();
			
			switch(score) {
			case "A":{
				System.out.println("あなたの評価は" + score + "です");
				break;
			}
			case "B":{
				System.out.println("あなたの評価は" + score + "です");
				break;
			}
			case "C":{
				System.out.println("あなたの評価は" + score + "です");
				break;
			}
			case "D":{
				System.out.println("あなたの評価は" + score + "です");
				break;
			}
			case "F":{
				System.out.println("あなたの評価は" + score + "です");
				break;
			}
			default:
				System.out.println("不明な評価です");
			}
		}

	}

}
