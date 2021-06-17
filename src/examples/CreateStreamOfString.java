package com.stream.examples;

import java.util.stream.Stream;

public class CreateStreamOfString {

	public static void main(String[] args) {
		
		Stream<String> streamOfString = Stream.of("a", "b");
		
		Stream<String> streamOfString2 = Stream.of(new String[] {"a", "b"});
		
		streamOfString.forEach(System.out::println);
		
		streamOfString2.forEach(System.out::println);
	}

}
