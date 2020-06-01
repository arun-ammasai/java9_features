package com.java9.features.safevarargs;

import java.util.List;

public class SafeVarArgsExample {

	@SafeVarargs // in java7
	SafeVarArgsExample(List<String>... li) {

	}

	@SafeVarargs // in Java7
	public static void method1(int... x) {

	}

	@SafeVarargs // in java7
	public static final void method2(int... x) {

	}
	
	@SafeVarargs // in java8 but invalid in java8 
	private static void method3(String... s) {
		
	}

	public static void main(String[] args) {

	}

}
