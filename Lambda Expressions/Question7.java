package com.java8_features.lamda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// 7. Write a lambda expression to calculate the average of a list of doubles.

public class Question7 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(3.5);
		list.add(2.3);
		list.add(2.4);
		list.add(4.5);
		list.add(3.3);
		list.add(3.6);
		
		Consumer<List<Double>> avg = (listOfDoubles)->{
			Double sum =0.0;
			Double average =0.0;
			for(Double d: list) {
				sum+= d;
				average=sum/list.size()-1;
				
			}
			System.out.println("Average = "+average);
		};
		
		avg.accept(list);
	}
}
