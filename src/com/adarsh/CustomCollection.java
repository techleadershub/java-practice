package com.adarsh;

import java.util.List;

public class CustomCollection implements Iterable<String> {

	private List<String> items;
	
	public CustomCollection(String[] initialItems) {
		this.items = java.util.Arrays.asList(initialItems);
	}

	public void add(String item) {
		items.add(item);
	}

	public void remove(String item) {
		items.remove(item);
	}

	@Override
	public java.util.Iterator<String> iterator() {
		return items.iterator();
	}
	

}
