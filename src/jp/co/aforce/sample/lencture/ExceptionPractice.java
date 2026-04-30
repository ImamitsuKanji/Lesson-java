package jp.co.aforce.sample.lencture;

public class ExceptionPractice {

	public static void main(String[] args) {
		String str = null;

		//		System.out.println(str.length());
		//		System.out.print("プログラムは継します。");

		//		try {
		//			System.out.println(str.length());
		//		} catch (NullPointerException e) {
		//			System.out.println("ヌルポが発生しました。" + e.getMessage());
		//		}
		//
		//		System.out.print("プログラムは継します。");

		//		try {
		//			int[] nums = { 1, 2, 3, 4, 5 };
		//			System.out.println(nums[5]);
		//		} catch (NullPointerException e) {
		//			System.out.println("ヌルポが発生しました。" + e.getMessage());
		//		}
		//
		//		System.out.print("プログラムは継します。");

		try {
			int age = 15;
			if (age < 18) {
				throw new IllegalArgumentException("18歳未満は登録できません。");
			}
			System.err.println("登録が完了しました。");
		} catch (IllegalArgumentException e) {
			System.err.println("例外が発生しました:" + e.getMessage());
		}

	}

}
