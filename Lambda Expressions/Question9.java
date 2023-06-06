package com.java8_features.lamda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

// 8. Create a lambda expression that counts the number of occurrences of a specific element in a list.

public class Question9 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("b");
		list.add("C");
		list.add("A");
		list.add("b");
		list.add("b");
		
		BiFunction<List<String>,String,Integer> occ = (listOfStrings,element) -> {
			Integer count = 0;
			for(String s: listOfStrings) {
			if(s.equals(element)) {
				count++;
			}
			}
			return count;
			
		};
		System.out.println("Occurrence :" + occ.apply(list, "b"));
		
	}

}
