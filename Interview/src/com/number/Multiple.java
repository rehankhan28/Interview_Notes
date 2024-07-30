package com.number;

import java.util.Arrays;

public class Multiple {
	public static void main(String[] args) {
		int a[] = { 45, 5, 15, 12, 56, 15, 24, 75, 31, 89 };
		long[] list = Arrays.stream(a).filter(o -> o % 5 == 0).mapToLong(o -> o).toArray();
		System.out.println(Arrays.toString(list));
	}
}