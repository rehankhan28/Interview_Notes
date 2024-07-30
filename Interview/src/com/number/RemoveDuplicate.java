//How do you remove duplicate elements from a list using Java 8 streams
package com.number;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		Object[] unique = listOfStrings.stream().distinct().toArray();
		System.out.println(Arrays.toString(unique));
	}
}