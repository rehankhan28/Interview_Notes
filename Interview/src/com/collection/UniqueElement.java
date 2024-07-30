package com.collection;

import java.util.Arrays;
import java.util.List;

public class UniqueElement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Spring", "Hibernate", "Java", "Spring");
		Object[] unique = list.stream().distinct().toArray();
		System.out.println(Arrays.toString(unique));
	}
}