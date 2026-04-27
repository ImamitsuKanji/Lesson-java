package jp.co.aforce.sample.exercise.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise6 {

	public static void main(String[] args) {
		{
			System.out.println("コレクション問１");
			List<String> arrayList = new ArrayList<>();
		
			arrayList.add("1");
			arrayList.add("2");
			arrayList.add("3");
			arrayList.add("4");
			arrayList.add("5");
		
			Collections.reverse(arrayList);
		
			System.out.println(arrayList);
		}
		
		{
			System.out.println("コレクション問2");
			List<String> arrayList = new ArrayList<>();
		
			arrayList.add("1");
			arrayList.add("2");
			arrayList.add("3");
			arrayList.add("4");
			arrayList.add("5");
		
			HashMap<Integer, String> map = new HashMap<>();
		
			for (int i = 0; i < arrayList.size(); i++) {
				map.put(i, arrayList.get(i));
			}
		
			System.out.println(map);
		
		}
		
		{
			System.out.println("リスト問１");
			List<Integer> numbers = new ArrayList<>();
			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
			numbers.add(4);
		
			if (numbers.contains(3)) {
				System.out.println("あります");
			} else {
				System.out.println("ありません");
			}
		}
		
		{
			System.out.println("リスト問２");
			List<String> stringList = new ArrayList<>();
			stringList.add("a");
			stringList.add("d");
			stringList.add("c");
			stringList.add("x");
		
			Collections.sort(stringList);
			System.out.println(stringList);
		}
		
		{
			System.out.println("リスト問２");
			List<String> stringList = new ArrayList<>();
			stringList.add("a");
			stringList.add("d");
			stringList.add("c");
			stringList.add("x");
		
			System.out.println(stringList.get(0));
			System.out.println(stringList.get(3));
		}
		
		{
			System.out.println("Hash問１");
			HashMap<Integer, String> hashMap = new HashMap<>();
			hashMap.put(1, "a");
			hashMap.put(2, "b");
			hashMap.put(3, "c");
			hashMap.put(4, "d");
		
			System.out.println(hashMap);
		}
		
		{
			System.out.println("Hash問２");
			HashMap<Integer, String> hashMap = new HashMap<>();
			hashMap.put(1, "a");
			hashMap.put(2, "b");
			hashMap.put(3, "c");
			hashMap.put(4, "d");
		
			if (hashMap.containsKey(3)) {
				System.out.println(hashMap.get(3));
			} else {
				System.out.println("ありません");
			}
		}
		
		{
			System.out.println("Hash問３");
			List<String> arrayList = new ArrayList<String>();
			HashMap<String, Integer> hashMap = new HashMap<>();
			arrayList.add("Java");
			arrayList.add("Python");
			arrayList.add("Java");
			arrayList.add("Ruby");
			arrayList.add("Python");
		
			for (String s : arrayList) {
				hashMap.putIfAbsent(s, 1);
			}
			
			System.out.println(hashMap.keySet());
		}
		
		{
			System.out.println("配列、リスト問1");
			Integer[] numbers = {1,2,3,4};
			List<Integer> numbersList = Arrays.asList(numbers);
			
			System.out.println(numbersList);
		}
		
		{
			System.out.println("配列、リスト問2");
			List<Integer> numbersList = new ArrayList<>();
			
			numbersList.add(1);
			numbersList.add(2);
			numbersList.add(3);
			numbersList.add(4);
			
			System.out.println("リスト" + numbersList);
			
			Integer[] numbers = numbersList.toArray(new Integer[0]);
			
			System.out.println("配列" + Arrays.toString(numbers));
		}

		{
			System.out.println("配列、リスト問3");
			
			System.out.println("1:変更の必要がないため配列が向いている");

			int average = 0;
			int age = 0;

			String[] nameList = {"飯田","宇都宮","慧"};
			int[] scoreList = {70,80,90};
			
			for(int i:scoreList) {
				age += i;
			}
			
			average = age / nameList.length;
			
			System.out.println("平均は" + average);

		}

	}

}
