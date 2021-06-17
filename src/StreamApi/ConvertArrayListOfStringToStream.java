package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListOfStringToStream {

	public static void main(String[] args) {
		
		List<String> listOfIntegers = new ArrayList<>();
		listOfIntegers.add("a");
		listOfIntegers.add("b");
		
		Stream<String> streamOfInteger = listOfIntegers.stream();
		
		streamOfInteger.forEach(System.out::println);
	}

}
