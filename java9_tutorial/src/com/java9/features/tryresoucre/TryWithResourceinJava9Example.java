package com.java9.features.tryresoucre;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithResourceinJava9Example {
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br1 = new BufferedReader(new FileReader("test.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("test.txt"));
		BufferedReader br3 = new BufferedReader(new FileReader("test.txt"));
		BufferedReader br4 = new BufferedReader(new FileReader("test.txt"));
		try(br1;br2;br3;br4) {
			//some code 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
