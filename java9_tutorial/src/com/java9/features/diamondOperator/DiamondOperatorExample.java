package com.java9.features.diamondOperator;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorExample {

	public static void main(String[] args) {
		List<String> li1 = new ArrayList<String>(); // Before java7
		List<String> li2 = new ArrayList<>(); // in Java7
		
		List<String> li3 = new ArrayList<>() {
			@Override
			public int size() {
				return 10;
			}
		};
		
		System.out.println(li3.size());
		
		
	}

}
