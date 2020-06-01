package com.java9.features.diamondOperator;

import java.util.ArrayList;
import java.util.List;

public class ArraysVsCollectionExample {

	public static void main(String[] args) {
		//Array
		String s[] = new String[100];
		s[0] = "John";
		s[1] = "Nancy";
		//s[2] = new Integer(15);
		System.out.println("String Array :"+s);
		String name = s[0];
		
		// Collection
		List li = new ArrayList();
		li.add("John");
		li.add("Nancy");
		li.add(new Integer(15));
		System.out.println("List Collection :"+li);
		String name1 = (String)li.get(1);
	}

}
