package com.java9.features.process;

public class ProcessBuilderCompileExample {
	public static void main(String[] args) throws Exception{
		ProcessBuilder builder = new ProcessBuilder("javac","TestClass.java");
		builder.start();
		
		ProcessBuilder builder1 = new ProcessBuilder("java","TestClass");
		builder1.start();
	}
}
