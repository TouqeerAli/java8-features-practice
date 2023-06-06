package com.java8_features.lamda_expression;

//2. Implement a lambda expression that checks whether a given string is empty or not.
interface CheckEmpty{
	public boolean empty(String str);
}
public class Question2 {

	public static void main(String[] args) {
//		CheckEmpty isEmpty = s->{
//			if(s.length()==0)
//				return true;
//			else
//				return flase;
//		}
		
		CheckEmpty isEmpty = s->s.isEmpty()?true:false;
		System.out.println(isEmpty.empty("hello"));
	}

}
