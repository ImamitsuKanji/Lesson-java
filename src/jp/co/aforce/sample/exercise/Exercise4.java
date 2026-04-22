package jp.co.aforce.sample.exercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise4 {

	public static void main(String[] args) {
		{
			System.out.println("問１");
			System.out.println("avaogra");
		}

		{
			System.out.println("問2");
			LocalDate today = LocalDate.now();
			LocalDate birthday = LocalDate.of(2026, 11, 10);
			 long daysBetween = ChronoUnit.DAYS.between(today, birthday);
			System.out.println(daysBetween);
		}
	}

}
