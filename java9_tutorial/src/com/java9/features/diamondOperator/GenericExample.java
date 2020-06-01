package com.java9.features.diamondOperator;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		GenericExample ge = new GenericExample();
		String x = ge.genericExample("Hello", "World").get(0);
		Integer y = ge.genericExample(10,50).get(0);
		System.out.println(ge.genericExample("Hello", "World"));
		System.out.println(ge.genericExample(16, 20));
	}
	
	<T> List<T> genericExample(T t1 , T t2){
		List<T> li = new ArrayList<T>();
		li.add(t1);
		li.add(t2);
		return li;
	}

}

