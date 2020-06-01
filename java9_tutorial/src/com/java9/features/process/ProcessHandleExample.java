package com.java9.features.process;

import java.util.Optional;

public class ProcessHandleExample {

	public static void main(String[] args) {
		ProcessHandle handle = ProcessHandle.current();//5076
		System.out.println(handle);
		Optional<ProcessHandle> handle1 = ProcessHandle.of(5076);
		ProcessHandle h1 = handle1.get();
		ProcessHandle.Info info = h1.info();
		System.out.println(info.user().get());
		System.out.println(info.command().get());
		System.out.println(info.startInstant().get());
		System.out.println(info.totalCpuDuration().get());	
		
	}

}
