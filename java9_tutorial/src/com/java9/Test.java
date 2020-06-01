package com.java9;
public class Test {
	public static void main1(String args[])throws Exception {
		ProcessBuilder builder = new ProcessBuilder("open","//Users//arun//Vlog - The Programming Guy//Vlog Videos//Java9Features//java9_tutorial//src//com//java9//test.txt");
		builder.start();
	}
	public static void main(String[] args)throws Exception {
		ProcessBuilder builder = new ProcessBuilder("javac","//Users//arun//Vlog - The Programming Guy//Vlog Videos//Java9Features//java9_tutorial//src//com//java9//Test1.java");
		builder.start();
		ProcessBuilder builder1 = new ProcessBuilder("java","//Users//arun//Vlog - The Programming Guy//Vlog Videos//Java9Features//java9_tutorial//src//com//java9//Test1");
		builder1.start();
	}
}