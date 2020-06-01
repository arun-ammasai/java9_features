package com.java9;
public class Test {
	public static void main1(String args[])throws Exception {
		ProcessBuilder builder = new ProcessBuilder("notepad");
		builder.start();
	}
	public static void main(String[] args)throws Exception {
		ProcessBuilder builder = new ProcessBuilder("javac","Test1.java");
		builder.start();
		ProcessBuilder builder1 = new ProcessBuilder("java","Test1");
		builder1.start();
	}
}