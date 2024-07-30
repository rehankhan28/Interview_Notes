package com.number;

import java.util.stream.IntStream;

public class AddTenNumber {
	public static void main(String[] args) {
		int sum = IntStream.range(1, 11).sum();
		System.out.println(sum);
		IntStream.rangeClosed(1, 10).map(i -> i * 3).forEach(System.out::println);
	}
}