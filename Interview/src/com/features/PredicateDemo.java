package com.features;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> isGreaterThanTen = (n) -> n > 10;
		System.out.println(isGreaterThanTen.test(15)); // Output: true
		System.out.println(isGreaterThanTen.test(8)); // Output: false
	}
}