package jp.co.aforce.sample.exercise.classConstructor;

public class Car {

	String model;
	int price;
	
	public Car() {
		String model = "";
		int price = 50;
	}
	
	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}
}
