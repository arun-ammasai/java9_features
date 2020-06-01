package com.java9.features.privatemethod;

public class InterfaceExample1 implements Interface1{

	@Override
	public void welcome() {
		System.out.println("Welcome Method");		
	}

	@Override
	public void sayHi(String s) {
		System.out.println("Welcome Mr."+s);		
	}
	
	public String method2() {
		return "Messgae from InterfaceExample1";
	}

}
