package com.adarsh;

public class PersonMain {

	
	public static void main(String[] args) {
		Person person1 = new Person("Adarsh", 25);
		Person person2 = new Person("Adarsh", 25);
		
		//this will be false because objects reference is different
		System.out.println(person1 == person2); //will this be true or false?
		//this will be false if the equals method is not defined in Person class
		System.out.println(person1.equals(person2)); // will this be true or false?
	}
}
