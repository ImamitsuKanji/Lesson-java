package jp.co.aforce.sample.exercise;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest4 {

	public static void main(String[] args) {
		List<String> animalList = new ArrayList<>();

		animalList.add("犬");
		animalList.add("猫");
		animalList.add("ウサギ");
		animalList.add("ヘビ");

		String likeAnimal = "犬";

		if (animalList.contains(likeAnimal)) {
			System.out.println(likeAnimal + "はリストに含まれています。");
		} else {
			System.out.println(likeAnimal + "はリストに含まれていません。");
		}

		int num = 7;
		switch (num) {
		case 1: {
			System.out.println("冬物セール");
			break;
		}
		case 2: {
			System.out.println("春物を売る");
			break;
		}
		case 3: {
			System.out.println("春物を売る");
			break;
		}
		case 4: {
			System.out.println("春物を売る");
			break;
		}
		case 5: {
			System.out.println("春物を売る");
			break;
		}
		case 6: {
			System.out.println("夏物を売る");
			break;
		}
		case 7: {
			System.out.println("夏物を売る");
			break;
		}
		case 8: {
			System.out.println("夏物を売る");
			break;
		}
		case 9: {
			System.out.println("秋物を売る");
			break;
		}
		case 10: {
			System.out.println("冬物を売る");
			break;
		}
		case 11: {
			System.out.println("冬物を売る");
			break;
		}
		case 12: {
			System.out.println("冬物を売る");
			break;
		}
		default:
			System.out.println("不正なつきです");;
		}

	}

}
