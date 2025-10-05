package com.adarsh;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//uncomment method below
//	@Override
//	public boolean equals(Object person) {
//		Person per = (Person) person;
//		return per.getAge() == this.age && per.getName().equals(this.name);
//	}

}
