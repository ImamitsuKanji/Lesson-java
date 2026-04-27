package jp.co.aforce.sample.exercise;

public class PracticeTest2 {

	public static void main(String[] args) {
		final double TAX = 0.01;
		
		int x = 480;
		double price = x * TAX;
		System.out.println(price + "円");
		
		String name = "貫志";
		System.out.println(name);
		
		String s1 = "この商品の値段は" ;
		String s2 = "円です";
		System.out.println(s1 + price + s2);

	}

}
