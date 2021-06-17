package com.stream.examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CreateIntStreamAndUseReduceMethod {

	public static void main(String[] args) {

		IntStream streamOfIntegers = IntStream.of(1, 2, 3, 4);
		
		
		// reduce() method will reduce stream to calculate sum of Integers in IntStream
		OptionalInt optionalInt = streamOfIntegers.reduce((i1, i2) -> i1 + i2);
		
		//Display optionalInt
		System.out.println("Sum = " + optionalInt.getAsInt());
	}

}
