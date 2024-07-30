package com.number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxThree {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println("------Ascending Order------");
		listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);
		System.out.println("------Descending Order------");
		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}
}