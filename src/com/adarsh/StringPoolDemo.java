package com.adarsh;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
//static import of System.out
import static java.lang.System.out;

public class StringPoolDemo {
	
	int test1;
	
	static {
		  int numSecondsPerMinute = 60;
		  int numMinutesPerHour = 60;
		  int NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
		}
	
	public static void main(String[] args) throws RuntimeException, ArrayIndexOutOfBoundsException, Exception {
		out.println("Hello, World!");
		StringPoolDemo demo1 = new StringPoolDemo();
		//what is the use of numSecondsPerMinute and numMinutesPerHour
		//System.out.println(demo1.NUM_SECONDS_PER_HOUR); // Error: Cannot access non-static variable from static context
		//System.out.println(demo1.numSecondsPerMinute); // Error: Cannot access non-static variable from static context
		//System.out.println(demo1.numMinutesPerHour); // Error: Cannot access non-static variable from static context
		System.out.println(demo1.test1); // 0, default value for int
		
		
		String s1 = "Hello"; // String literal, goes to String Pool
		String s2 = "Hello"; // Same literal, points to same object in String Pool
		
		String s3 = new String("Hello"); // New String object in heap
		String s4 = new String("Hello"); // Another new String object in heap
		
		System.out.println("s1 == s2: " + (s1 == s2)); // true, same reference
		System.out.println("s1 == s3: " + (s1 == s3)); // false, different references
		System.out.println("s3 == s4: " + (s3 == s4)); // false, different references
		
		System.out.println("s1.equals(s2): " + s1.equals(s2)); // true, same content
		System.out.println("s1.equals(s3): " + s1.equals(s3)); // true, same content
		System.out.println("s3.equals(s4): " + s3.equals(s4)); // true, same content
		
		// Interning
		s1.intern();//s1 is already in pool
		String s5 = s3.intern(); // Returns reference from String Pool
		System.out.println("s1 == s5: " + (s1 == s5)); // true, both point to String Pool object
		
		Integer test = null;
		StringPoolDemo demo = new StringPoolDemo();
		
		List<String> list = List.of("One", "Two", "Three");
		//list.get(-1); // ArrayIndexOutOfBoundsException
		System.out.println(demo.test1);
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		
	}

}
