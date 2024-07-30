package com.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeWithOutDupl {
	public static void main(String[] args) {
		int a[] = { 12, 21, 21, 21, 2, 2, 12, 12 };
		int b[] = { 3, 3, 33, 43, 34, 34, 34, 34 };
		int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(c));
	}
}