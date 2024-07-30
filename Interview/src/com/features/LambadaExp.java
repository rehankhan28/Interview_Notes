package com.features;

import java.util.function.BiConsumer;

public class LambadaExp {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bi = (a, b) -> System.out.println(a + b);
		bi.accept(10, 12);
	}
}
