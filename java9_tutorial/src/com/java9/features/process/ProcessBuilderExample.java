package com.java9.features.process;

public class ProcessBuilderExample {

	public static void main(String[] args) throws Exception{
		ProcessBuilder builder = new ProcessBuilder("notepad","C:\\Users\\Arun\\git\\java9_features\\java9_tutorial\\src\\com\\java9\\features\\process\\sample.txt");
		//builder.start();
		
		ProcessBuilder builder1 = new ProcessBuilder("mspaint");
		builder1.start();
		
	}

}
