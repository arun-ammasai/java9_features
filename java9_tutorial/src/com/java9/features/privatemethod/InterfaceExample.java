package com.java9.features.privatemethod;

interface Interface1{
	void welcome();
	void sayHi(String s);
	default String method2() {
		return "Default Method"; 
	}
	static void staticMethod() {
		System.out.println("Message from Static Method");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		InterfaceExample1 i1 = new InterfaceExample1();
		i1.welcome();
		i1.sayHi("John");
		System.out.println(i1.method2());
		Interface1.staticMethod();
	}

}