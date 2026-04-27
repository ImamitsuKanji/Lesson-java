package jp.co.aforce.sample.exercise;

public class TaiyakiMain extends Taiyaki {

	public static void main(String[] args) {
		Taiyaki ankotaiyaki = new Taiyaki();
		Taiyaki creamTaiyaki = new Taiyaki();
		
		ankotaiyaki.setFilling("餡子");
		ankotaiyaki.showFilling();
		
		creamTaiyaki.setFilling("クリーム");
		creamTaiyaki.showFilling();

	}

}
