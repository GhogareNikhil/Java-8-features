package com.stream.examples;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class CreateDoubleStreamAndUseReduceMethod {

	public static void main(String[] args) {
		
		DoubleStream streamOfDoubles = DoubleStream.of(1.1, 2.2, 3.3);
		
		
		// reduce() method will reduce stream to calculate sum of Doubles in DoubleStream
		OptionalDouble optionalDouble = streamOfDoubles.reduce((i1, i2) -> i1 + i2);
		
		//Display optionalDouble
		System.out.println("Sum = " + optionalDouble.getAsDouble());
	}

}
