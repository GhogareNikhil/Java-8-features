package FunctionalnterfacePrac;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
		Consumer<Integer> consumer=t -> System.out.println("printing value: "+t);
		consumer.accept(10);
		
		List<Integer> list= Arrays.asList(2,5,3,7,8,4);
		list.stream().forEach(t -> System.out.println("print value: "+t));
	}
    
}
