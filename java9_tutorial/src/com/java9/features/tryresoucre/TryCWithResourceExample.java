package com.java9.features.tryresoucre;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryCWithResourceExample {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			System.out.println("Try Block");			
		} catch (Exception e) {
			System.out.println("Exception Block");
			e.printStackTrace();
		}
	}

}
