package jp.co.aforce.sample.exercise.StaticFieldPractice;

public class Counter {
	//	int count;
	static int count;
	int num;

	public Counter(int count) {
		Counter.count = count;
	}

	int addCount(int num) {
		for (int i = 0; i > num; i++) {
			count++;
		}
		return count;
	}

	void shownum(int age) {
		System.out.println("このカウンタは" + age + "です");
	}

	public static void main(String[] args) {
		Counter counter1 = new Counter(1);
		counter1.shownum(counter1.addCount(Counter.count));
		Counter counter2 = new Counter(7);
		counter2.shownum(counter2.addCount(Counter.count));
		Counter counter3 = new Counter(2);

		counter1.shownum(counter1.addCount(Counter.count));
		counter2.shownum(counter2.addCount(Counter.count));
		counter3.shownum(counter3.addCount(Counter.count));
	}

}
