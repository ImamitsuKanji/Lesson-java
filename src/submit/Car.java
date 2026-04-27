package jp.co.aforce.sample.exercise.incetance;

import java.util.Scanner;

public class Car {
	String model;
	int speed;
	
	void showCar(String model, int speed) {
		System.out.println("この車は車種は" + model + "で" + speed + "km/h出ます");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String carModle = scanner.nextLine();
		int carSpeed = scanner.nextInt();
		Car car = new Car();
		car.showCar(carModle, carSpeed);
		
	}
}
