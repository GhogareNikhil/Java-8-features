package FunctionalnterfacePrac;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Predicate<Integer> predicate= new PredicateDemo();
		System.out.println(predicate.test(2));
		Predicate<Integer> pred=t-> t%2==0;
		System.out.println(pred.test(9));
		
		List<Integer> list= Arrays.asList(2,5,3,7,8,4);
		list.stream().filter(predicate).forEach(t-> System.out.println("print Even: "+t));
	}

}
