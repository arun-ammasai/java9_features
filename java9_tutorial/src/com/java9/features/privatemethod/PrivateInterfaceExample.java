package com.java9.features.privatemethod;

interface TestInterface{
	void method1();
	default String method2() {
		method3();
		method4();
		return "Default Method"; 
	}
	static void staticMethod() {
		method4();
		System.out.println("Message from Static Method");
	}
	private void method3() {
		System.out.println("Message from Method3");
	}
	private static void method4() {
		System.out.println("Message from Method4");
	}
}

public class PrivateInterfaceExample implements TestInterface{

	@Override
	public void method1() {
		System.out.println("Message from Method1");		
	}
	
	public static void main(String[] args) {
		PrivateInterfaceExample obj = new PrivateInterfaceExample();
		obj.method1();
		System.out.println(obj.method2());
		TestInterface.staticMethod();
	}

}
