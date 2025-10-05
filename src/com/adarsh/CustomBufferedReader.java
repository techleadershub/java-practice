package com.adarsh;

public class CustomBufferedReader implements AutoCloseable {

	@Override
	public void close() throws Exception {
		//I will write close logic here
		System.out.println("Inside close() method");
	}

}
