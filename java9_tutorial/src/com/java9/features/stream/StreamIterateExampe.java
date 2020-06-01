package com.java9.features.stream;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamIterateExampe {
	static UnaryOperator<Integer> uo2 = a -> a+1;
	public static void main(String[] args) {
		Stream<Integer> s1 =Stream.iterate(0, uo2).limit(10);
		//s1.forEach(System.out::println);
		
		Stream<Integer> s2 =Stream.iterate(0, x-> x<=3,uo2);
		s2.forEach(System.out::println);
	}

}
