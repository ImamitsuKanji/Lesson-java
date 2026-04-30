package jp.co.aforce.sample.exercise.StaticFieldPractice;

public class Student {
	static String schoolname;

	public Student(String schoolname) {
		Student.schoolname = schoolname;
	}

	void showSchool() {
		System.out.println(schoolname + "です");
	}

	public static void main(String[] args) {
		Student student1 = new Student("○○学校");
		student1.showSchool();
		Student student2 = new Student("××学校");
		student2.showSchool();
		Student student3 = new Student("△△学校");

		student1.showSchool();
		student2.showSchool();
		student3.showSchool();
	}

}
