//Given a list of integers, separate odd and even numbers
package com.number;

import java.util.Arrays;

public class EvenOdd {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int even[] = Arrays.stream(a).filter(o -> o % 2 == 0).toArray();
		System.out.println("Even : " + Arrays.toString(even));
		int odd[] = Arrays.stream(a).filter(o -> o % 2 != 0).toArray();
		System.out.println("Odd : " + Arrays.toString(odd));
	}
}