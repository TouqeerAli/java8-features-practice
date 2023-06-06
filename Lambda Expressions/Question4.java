package com.java8_features.lamda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

// 4. Write a lambda expression to find the maximum value in a list of integers.

public class Question4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		list.add(5);
		Function<List<Integer> ,Integer> max = (listOfIntegers)->{
			Collections.sort(list);
			return list.get(list.size()-1);
		};
		System.out.println(max.apply(list));

	}

}
