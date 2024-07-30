package com.features;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String str[] = new String[10];
		Optional<String> check = Optional.ofNullable(str[5]);
		if (check.isPresent()) {
			String lower = str[5].toLowerCase();
			System.out.println("String is in Lower Case");
		} else {
			System.out.println("String is not present");
		}
	}
}