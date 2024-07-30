package com.string;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		int a[] = { 12, 21, 23, 32, 34, 43 };
		int out[] = Arrays.stream(a).filter(n -> n % 2 == 0).toArray();
		System.out.println(Arrays.toString(out));
	}
}