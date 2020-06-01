package com.java9.features.privatemethod;

interface Inter1{
	public abstract void method1();
    
    public default void method2() {
        method4();  
        method5();  
        System.out.println("default method");
    }
     
    public static void method3() {
        method5();
        System.out.println("static method");
    }
     
    private void method4(){
        System.out.println("private method");
    } 
     
    private static void method5(){
        System.out.println("private static method");
    } 
}

public class InterfaceExampleTest {

	public static void main(String[] args) {
		
	}

}
