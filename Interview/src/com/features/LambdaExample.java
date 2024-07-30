package com.features;

import java.util.Arrays;
import java.util.List;

class LambdaExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");
		names.sort((a, b) -> a.compareTo(b));
		System.out.println(names);
		
		names.forEach(s -> System.out.println(s));
	}
}