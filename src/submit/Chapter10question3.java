package jp.co.aforce.sample.exercise.OverLoad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter10question3 {

	/*public int sum(Integer... numbers) {*/
	public int sum(int... numbers) {
		int total = 0;
		for (int i : numbers) {
			total += i;
		}
		return total;
	}

	public void makeList() {
		/*余分*/
		Chapter10question3 c = new Chapter10question3();
		List<Integer> numberList = new ArrayList<>();
		boolean flag = true;

		while (flag) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();

			if (input.trim().isEmpty()) {
				flag = false;
			} else {
				int num = Integer.parseInt(input);
				numberList.add(num);
			}

		}

		//		for (int i : numberList) {
		//			System.out.println(i);
		//		}

		/*Integer[] numbers = numberList.toArray(new Integer[0]);*/
		int[] numbers = numberList.stream()
				.mapToInt(Integer::intValue)
				.toArray();

		/*ここまで*/
		
		System.out.println("合計で" + c.sum(numbers));

	}

	public static void main(String[] args) {
		Chapter10question3 c = new Chapter10question3();

		c.makeList();

	}

}
