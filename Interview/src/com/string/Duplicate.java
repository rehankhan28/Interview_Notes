package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		// Method 1
		Object[] duplicate = listOfStrings.stream().distinct().toArray();
		System.out.println(Arrays.toString(duplicate));
		// Method 2
		List<String> dupl = listOfStrings.stream().distinct().collect(Collectors.toList());
		System.out.println(dupl);
	}
}