package com.features;

public class MethodeReferenceDemo {
	public static void main(String[] args) {
		FunctionalInterfaceDemo ft = Test::impl;
		ft.abstractMethod();
		
//		FunctionalInterfaceDemo ft=()->System.out.println("Hello FI");
//		ft.abstractMethod();
	}
}

class Test {
	public static void impl() {
		System.out.println("Class --Test");
	}
}