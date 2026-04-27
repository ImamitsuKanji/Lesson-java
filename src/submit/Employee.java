package jp.co.aforce.sample.exercise.classBasics;

public class Employee {
	
	String ID;
	String name;
	int salary;
	
	void raiseSalary(String ID, String name, int salary) {
		salary += 10000;
		System.out.println("ID番号" + ID + "の" + name + "が昇給して" + salary + "円");
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.raiseSalary("01", "kanji", 200000);

	}

}
