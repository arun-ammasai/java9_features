package com.java9.features.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java9.features.repo.Person;
import com.java9.features.repo.PersonRepository;

public class TakeDropWhileExample {
	static Predicate<Person> p1 = per -> per.getHeight()>=140 && per.getGender().equals("Male");
	public static void main(String[] args) {
		List<Person> list = PersonRepository.getAllPersons();
		list.stream()
		.filter(p1).collect(Collectors.toList())
		.forEach(System.out::println);
		System.out.println("=======================");
		list.stream()
		.takeWhile(p1)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		System.out.println("=======================");
		list.stream()
		.dropWhile(p1)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}	
}
