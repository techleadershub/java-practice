package com.adarsh;

import java.io.File;
import java.io.FileReader;

public class Main {

	
	public static void main(String[] args) {
		
		CustomCollection customCollection = new CustomCollection(new String[] {"One", "Two", "Three"});
		
		for(String s : customCollection) {
			System.out.println(s);
		}
		
		
		
		Main main = new Main();
		
		String s = "Hello, World!";
		s = "Hiiii";
		
		try {
			FileReader fs = new FileReader("somefile.txt");
			fs.read();
			String str = "hello";
			//fs.close(); // Resource leak if an exception occurs before this line
			//str will be garbage collected
			//but fs will not be closed
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello, World!");
	}
	
}
