package com.array;

import java.util.Arrays;

public class Frequency {
	public static void main(String[] args) {
		int[] array = { 1, 15, 7, 9, 8, 6, 2, 14, 3, 13, 4, 12 };
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println(max);

		int min = Arrays.stream(array).min().getAsInt();
		System.out.println(min);
	}
}