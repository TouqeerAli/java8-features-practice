package com.java8_features.lamda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// 10. Write a lambda expression to find the square of each number in a list of integers.

public class Question10 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(6);
		
		list.replaceAll(s -> s*s);
		System.out.println(list);
//		Consumer<List<Integer>> square = (listOfInteger) ->{
//			for(Integer i : listOfInteger) {
//				System.out.println("Square of "+i+" is "+ (Math.pow(i, 2)));
//			}
//		};
//		square.accept(list);

	}

}
