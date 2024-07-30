package com.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Emp {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 12, 34334, 324, 534, 445, 55);
		// Sort
		Object[] sort = list.stream().sorted(Comparator.reverseOrder()).toArray();

		Object[] sort1 = list.stream().sorted(Comparator.naturalOrder()).toArray();
		System.out.println(Arrays.toString(sort));
		System.out.println("-----------------");
		System.out.println(Arrays.toString(sort1));
	}
}