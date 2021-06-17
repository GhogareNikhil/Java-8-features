package StreamApi;

import java.util.stream.Stream;

public class CreateStreamOfInteger {

	public static void main(String[] args) {
		
		Stream<Integer> streamOfInteger = Stream.of(11, 12, 13);
		
		Stream<Integer> streamOfInteger2 = Stream.of(new Integer[] {11, 12, 13});
		
		streamOfInteger.forEach(System.out::println);
		
		streamOfInteger2.forEach(System.out::println);
	}

}
