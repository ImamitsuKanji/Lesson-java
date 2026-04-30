package jp.co.aforce.sample.exercise.StaticMethodPractice;

public class ArrayUtils {

	static int max(int[] numbers) {
		int max = numbers[0];
		System.out.println();
		for (int i:numbers) {
			if(max < numbers[i]) max = numbers[i];
			System.out.println(max);
		}
		return max;
	}
	
	void showMax(int maxnum) {
		System.out.println("今回の最高値は" + maxnum);
	}

	public static void main(String[] args) {
		ArrayUtils arrayUtils = new ArrayUtils();
		int[] numbers = {1, 4, 3, 4, 5, 1};
		
		arrayUtils.showMax(ArrayUtils.max(numbers));

	}

}
