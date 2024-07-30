package com.features;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	void abstractMethod();
//	void m1();

	default void prime1() {
		System.out.println("Funcational Interface");
	}

	default void prime2() {
		System.out.println("Funcational Interface");
	}
}