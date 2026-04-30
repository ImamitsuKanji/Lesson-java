package jp.co.aforce.sample.exercise.StaticMethodPractice;

public class StringUtils {

	static String UpperCase(String str) {
		String upperStr = str.toUpperCase();
		return upperStr;
	}

	void showStr(String upperStr) {
		System.out.println(upperStr);
	}

	public static void main(String[] args) {
		StringUtils stringUtils = new StringUtils();
		stringUtils.showStr(StringUtils.UpperCase("abcd"));
		stringUtils.showStr(StringUtils.UpperCase("1234"));
		stringUtils.showStr(StringUtils.UpperCase("あいうえお"));

	}

}
