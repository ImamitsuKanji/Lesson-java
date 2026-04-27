package jp.co.aforce.sample.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {

	public static void main(String[] args) {
		String[] itemList = {"シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム"};
		System.out.println(itemList[1]);
		
		List<String> employeeList = new ArrayList<>();
		employeeList.add("山田太郎");
		employeeList.add("鈴木花子");
		employeeList.add("佐藤二郎");
		employeeList.add("山田太郎");
		employeeList.add("高橋三朗");
		
		System.out.println(employeeList.get(2));
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		list1.addAll(list2);
		Collections.sort(list1);
		
		System.out.println(list1);
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		
		Collections.sort(list3);
		
		System.out.println(list1 + "\n" + list3);

	}

}
