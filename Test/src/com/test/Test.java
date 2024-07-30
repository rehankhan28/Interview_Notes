package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test {
	public static void main(String arg[]) {
		List<Integer> list = Arrays.asList(12, 21, 23, 33, 34343, 12, 21);
		List<Integer> sortedListAsc = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortedListAsc);
	}
}