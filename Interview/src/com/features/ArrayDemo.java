package com.features;

import java.util.stream.Stream;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] arr = { "Geeks", "for", "Geeks" };
		// Using Arrays.stream to convert an
		// array into Stream
		Stream<String> stm = Stream.of(arr);

		// Displaying elements in Stream
		stm.forEach(str -> System.out.print(str + " "));
	}
}
