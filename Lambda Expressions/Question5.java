package com.java8_features.lamda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

// 5. Implement a lambda expression to sort a list of strings in ascending order.
public class Question5 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("a");
		list.add("E");
		list.add("e");
		list.add("I");
		list.add("i");
		list.add("O");
		list.add("o");
		list.add("U");
		list.add("u");
		
		Consumer<List<String>> sortedList	=(listOfString) ->{
			Collections.sort(list);
			System.out.println(list);
		};
			
		sortedList.accept(list);
	}

}
