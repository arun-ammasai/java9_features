package com.java9.features.factorymethod;

import java.util.Map;
import java.util.Set;

public class FactoryMethodExample {

	public static void main(String[] args) {
		//List<String> names = List.of("Adam","Sam","Nancy","Adam"); 
		//System.out.println(names);
		//names.add("Paul");
		
		//Set<String> names = Set.of("Adam","Sam","Nancy",null); 
		//System.out.println(names);
		//names.add("Paul");
		
		Map<Integer,String> map = Map.of(1, "Adam",2, "Sam",3, "Nancy");
		System.out.println(map);
		map.put(4, "Paul");
	}

}
