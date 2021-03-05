package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedTest {

	public static void main(String[] args) 
	{

		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(9);
		list.add(85);
		list.add(2);
		list.add(100);
		
		List<Integer> l1=list.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		
		//l.stream().sorted(i1,i2)-> s1.comp
	}

}
