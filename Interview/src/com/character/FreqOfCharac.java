//How do you find frequency of each character in a string using Java 8 streams?
package com.character;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfCharac {
	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day";
		String input = inputString.replaceAll(" ", "");
		Map<Character, Long> map = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}