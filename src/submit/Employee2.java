package jp.co.aforce.sample.exercise.Override;

public class Employee {
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return this.id == other.id;
	}
	
	
	public static void main(String[] args) {
		Employee employee1 = new Employee(01, "a");
		Employee employee2 = new Employee(01, "b");
		Employee employee3 = new Employee(03, "c");
		
		if(employee1.equals(employee2)) {
			System.out.println("employee1とemployee2は同じ社員IDです");
		}
		
		if(employee1.equals(employee3)) {
			System.out.println("employee1とemployee3は違う社員です");
		}

	}

}
