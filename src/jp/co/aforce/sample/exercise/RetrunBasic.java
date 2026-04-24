package jp.co.aforce.sample.exercise;

public class RetrunBasic {
	
	void greet(String name){
		System.out.println("こんにちは、" + name + "さん！");
	}
	
	
	public static void main(String[] args) {
		{
			System.out.println("問１");
			RetrunBasic retrunbasic = new RetrunBasic();
			retrunbasic.greet("kanji");
		}
		
		{
			System.out.println("問２");
			
		}

	}

}
