package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test {
	public static void main(String[] args) {
		int a[] = { 12, 21, 232, 32, 44, 44, 32 };
		List<Integer> list = Arrays.stream(a).boxed().sorted().distinct().collect(Collectors.toList());
		System.out.println(list);
	}
}