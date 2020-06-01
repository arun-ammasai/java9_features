package com.java9.features.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<String> names = List.of("Paul","Sam","Nancy");
		
		List<Integer> li = List.of(2,4,6,8,9,10,11,12);
		li.stream().dropWhile(x -> x%2==0).collect(Collectors.toList())
		.forEach(System.out :: println);
		
		/*li.stream().takeWhile(x -> x%2==0).collect(Collectors.toList())
		.forEach(System.out :: println);
		
		names.stream().takeWhile(s -> s.length()>3).collect(Collectors.toList())
		.forEach(System.out :: println);
		
		 * names.stream().filter(s -> s.length()>3).collect(Collectors.toList())
		 * .forEach(System.out :: println);
		 * 
		 * names.stream().map(x-> x.toUpperCase()).collect(Collectors.toList())
		 * .forEach(System.out :: println);
		 */
	
		
	}
	
}
