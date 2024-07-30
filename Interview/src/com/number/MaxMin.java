package com.number;

import java.util.Arrays;

public class MaxMin {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 12, 21, 44, 34 };
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("Maximum : " + max);

		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("Minimum : " + min);
	}
}