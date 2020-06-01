package com.java9.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNullableExample {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Adam");
		li.add(null);
		li.add("Nancy");
		//li.stream()
		//.flatMap(s -> Stream.ofNullable(s)).collect(Collectors.toList()).forEach(System.out:: println);
		
		//li.forEach(System.out:: println);
		
		List li1 = Stream.ofNullable(null).collect(Collectors.toList());
		System.out.println(li1);
	}

}
