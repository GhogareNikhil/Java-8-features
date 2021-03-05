package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(30);
		
		List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
