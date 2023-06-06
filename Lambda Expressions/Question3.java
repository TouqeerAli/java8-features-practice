package com.java8_features.lamda_expression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 3. Create a lambda expression to filter out all the even numbers from a list of integers.
interface EvenIntegers{
	public void filter(List<Integer> list);
}
public class Question3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		EvenIntegers even = (listOfInteger)-> {
			for(Integer l : list) {
				if(l%2==0)
					System.out.println(l);
	
			}
		};
		even.filter(list);
	}

}
