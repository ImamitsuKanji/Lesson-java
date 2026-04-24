package jp.co.aforce.sample.exercise.incetance;

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
		Student student1 = new Student();
		Student student2 = new Student();
		int[] scores1 = student1.score;
		int[] scores2 = student2.score;
		student1.averge(scores1, "kanji", 0);
		student2.averge(scores2, "kanji", 0);
	}

}
