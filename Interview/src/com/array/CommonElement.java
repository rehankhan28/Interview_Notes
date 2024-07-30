package com.array;

import java.util.Arrays;
import java.util.Comparator;
public class CommonElement {
	public static void main(String[] args) {
		int[] a = { 12, 21, 232, 33, 34343, 12, 21 };
		int[] sortedArray = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
				.toArray();
		System.out.println(Arrays.toString(sortedArray));
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("Maximum : " + max);
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("Manimum : " + min);
		int even[] = Arrays.stream(a).filter(o -> o % 2 == 0).toArray();
		System.out.println(Arrays.toString(even));
		int odd[] = Arrays.stream(a).filter(o -> o % 2 != 0).toArray();
		System.out.println(Arrays.toString(odd));
	}
}