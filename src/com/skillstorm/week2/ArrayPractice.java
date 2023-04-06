package com.skillstorm.week2;

public class ArrayPractice {

	public static void main(String[] args) {

		String[] favoriteFoods = { "enchiladas", "pickles", "strawberries" };
		System.out.printf("%s, %s, %s%n", favoriteFoods[0], favoriteFoods[1], favoriteFoods[2]);

		favoriteFoods = new String[] { "enchiladas", "pickles", "raspberries" };
		System.out.printf("%s, %s, %s%n", favoriteFoods[0], favoriteFoods[1], favoriteFoods[2]);
	}
}
