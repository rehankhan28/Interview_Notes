package com.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParalletStreamDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Using Parallel Stream to filter and map
		List<Integer> evenNumbers = numbers.parallelStream().filter(n -> n % 2 == 0).map(n -> n * 2)
				.collect(Collectors.toList());

		System.out.println(evenNumbers); // Outputs: [4, 8]
	}
}