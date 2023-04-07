package com.skillstorm.week2;

public class MoreArrayPractice {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 2, 3 };
		int[] c = { 2 };
		int[] d = {};
		int[] e = null;
		int[] f = {-2, 0, 18, -28};
		System.out.println(findMax(a));
		System.out.println(findMax(b));
		System.out.println(findMax(c));
		System.out.println(findMax(d));
		System.out.println(findMax(e));
		System.out.println(findMax(f));
		System.out.println("-----Part Two-----");
		System.out.println(findMin(a));
		System.out.println(findMin(b));
		System.out.println(findMin(c));
		System.out.println(findMin(d));
		System.out.println(findMin(e));
		System.out.println(findMin(f));

	}

	public static int findMax(int[] numbers) {

		int index = 0;
		int trackerMax = Integer.MIN_VALUE;
		if (numbers == null || numbers.length <= 0) {
			return index; // returns 0 instead of 2 billion
		} else {
			while (index < numbers.length) {
				trackerMax = Math.max(trackerMax, numbers[index]);
				index++;
			}
			return trackerMax;
		}
	}
	
	public static int findMin(int[] numbersAgain) {
		int index = 0;
		int trackerMin = Integer.MAX_VALUE;
		if (numbersAgain == null || numbersAgain.length <= 0) {
			return trackerMin; // returns 2147483647 instead of 0
		} else {
			while (index < numbersAgain.length) {
				trackerMin = Math.min(trackerMin, numbersAgain[index]);
				index++;
			}
			return trackerMin;
		}
	}
}