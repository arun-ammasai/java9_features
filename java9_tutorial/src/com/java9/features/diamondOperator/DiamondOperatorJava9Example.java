package com.java9.features.diamondOperator;

public class DiamondOperatorJava9Example {
	public static void main(String[] args) {
		TetsClass<Double> c1 = new TetsClass<Double>(20.5) {

			@Override
			void overRideMe() {
				System.out.println("Processing "+getT());
			}
			
		};
		c1.overRideMe();
		
	}
}

class TetsClass<T>{
	T t;

	public TetsClass(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	void overRideMe() {
		System.out.println("Processing Data......");
	}
}
