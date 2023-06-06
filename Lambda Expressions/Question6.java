package com.java8_features.lamda_expression;

import java.util.function.Consumer;

// 6. Create a lambda expression that checks whether a given number is prime or not.

public class Question6 {

	public static void main(String[] args) {
		
		Consumer<Integer> primeNumber = (n)->{
			int flag=0;
			if (n <= 1) {  
				System.out.println(n+" is not a prime number.");
				flag++;
		       }  
		       for (int i = 2; i <= Math.sqrt(n); i++) {  
		           if (n % i == 0) {  
		        	   System.out.println(n+" is not a prime number.");
		        	   flag++;
		           }  
		       }  
		       if(flag==0)
		       System.out.println(n+ " is prime number.");
		};
		primeNumber.accept(9);
	}

}
