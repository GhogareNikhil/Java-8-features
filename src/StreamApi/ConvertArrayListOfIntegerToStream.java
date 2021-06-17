package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListOfIntegerToStream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		
		Stream<Integer> streamOfInteger = list.stream();
		
		streamOfInteger.forEach(System.out::println);
	}

}
