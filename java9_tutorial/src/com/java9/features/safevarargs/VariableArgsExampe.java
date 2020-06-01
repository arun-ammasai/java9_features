package com.java9.features.safevarargs;

public class VariableArgsExampe {

	public static void main(String[] args) {
		sum(10, 15);
		// int i , j ,k 
		// int i,j,k,l
		sum1(15,10,45,67,87);
	}
	
	static int sum(int i,int j) {
		return (i+j);
	}
	// int... x - into an array
	
	static void sum1(int... x) {
		int total =0;
		for(int i :x) {
			total = total+i;
		}
		System.out.println("Total is :"+total);
	}

}
