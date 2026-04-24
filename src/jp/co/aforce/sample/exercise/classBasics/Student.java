package jp.co.aforce.sample.exercise.classBasics;

public class Student {
	String name;
	int[] score = {11,22,33,44,55,66,77,88};
	int total;

	void averge(int[] score, String name, int total) {
		for (int n : score) {
			total += n;
		}

		total = total / score.length;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		int[] scores = student.score;
		student.averge(scores, "kanji", 0);
	}
}
