package com.java8_features.lamda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


// 8. Implement a lambda expression to convert a list of strings to uppercase.
public class Question8 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("grapes");
		
		fruits.replaceAll(s -> s.toUpperCase());
		System.out.println(fruits);
		
//		Consumer<List<String>> list = (fruitsList)-> {
//			for(int i=0; i<fruitsList.size(); i++) {
//				fruitsList.set(i, fruitsList.get(i).toUpperCase());
//			}
//			
//		};
//		list.accept(fruits);
//		System.out.println(fruits);
		
	}

}
