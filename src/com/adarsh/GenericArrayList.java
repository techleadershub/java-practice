package com.adarsh;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("new");
//		strList.add(1);
		
		String str = strList.get(1);
		
		List genList = new ArrayList();
		genList.add("new");
		genList.add(1);
		
		Object object = genList.get(0);
		
	}
	
}
