package jp.co.aforce.sample.exercise;

public class Taiyaki {

	String filling;
	
	//中身をセットする
		public void setFilling(String value) {
			filling = value;
		}
		
	//中身を表示するメソッド
		public void showFilling() {
			System.out.println("このたい焼きの中身は" + filling + "です。");
		}

}