package com.java8_features.lamda_expression;

//1. Write a lambda expression that takes two integers as input and returns their sum.
interface Addition{
	public double sum(int a, int b);
}
public class Question1 {

	public static void main(String[] args) {
		
		Addition sumOfTwo = (a,b) -> a+b;
		System.out.println(sumOfTwo.sum(2, 3));
		

	}

}
