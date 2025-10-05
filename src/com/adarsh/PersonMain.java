package com.adarsh;

import java.util.HashSet;

public class PersonMain {

	
	public static void main(String[] args) {
		Person person1 = new Person("Adarsh", 25);
		Person person2 = new Person("Adarsh", 25);
		
		//this will be false because objects reference is different
		System.out.println(person1 == person2); //will this be true or false?
		//this will be false if the equals method is not defined in Person class
		System.out.println(person1.equals(person2)); // will this be true or false?
		
		
		HashSet<Person> personSet = new HashSet<>();
		personSet.add(person1);
		personSet.add(person2);
		
		System.out.println(personSet.size()); // will size be 1 or 2?
		
	}
}
