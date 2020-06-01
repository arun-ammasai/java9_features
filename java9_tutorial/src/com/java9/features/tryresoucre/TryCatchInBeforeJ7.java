package com.java9.features.tryresoucre;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryCatchInBeforeJ7 {
	public static void main(String[] args) {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		BufferedReader br3 = null;
		BufferedReader br4 = null;
		try {
			// Some Resource
			br1 = new BufferedReader(new FileReader("test.txt"));
		} catch (Exception e) {
			// Handle Exception
			System.out.println("Exception Block");
			e.printStackTrace();
			// Some Code
		} finally {
			// Cleanup Code
			try {
				br1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				br3.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				br4.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
