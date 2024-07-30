package com.number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	public static void main(String[] args) {
		int a[] = { 45, 22, 12, 56, 15, 24, 75, 31, 89 };
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("Maximum : " + max);
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("Minimum : " + min);

		List<Integer> list = Arrays.asList(45, 22, 12, 12, 56, 56, 15, 24, 75, 31, 89);
		int maximum = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Maximum : " + maximum);

		int minimum = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Minimum : " + minimum);
		Object asc[] = list.stream().sorted().distinct().toArray();
		System.out.println("Ascending : " + Arrays.toString(asc));
		Object desc[] = list.stream().sorted(Comparator.reverseOrder()).distinct().toArray();
		System.out.println("Descending : " + Arrays.toString(desc));
	}
}