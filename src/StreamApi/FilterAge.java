package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAge {

	public static void main(String[] args) 
	{

		Person p= new Person(1,"nikhil", 27);
		Person p1= new Person(2, "Akshay", 26);
		Person p3= new Person(3,"vbv", 27);
		Person p4= new Person(4,"shubham", 25);

		ArrayList<Person> list= new ArrayList<Person>();
		list.add(p);
		list.add(p1);
		list.add(p3);
		list.add(p4);
		List<Person> person=  list.stream().filter(x -> x.getAge() < 27).collect(Collectors.toList());
		person.forEach(product ->System.out.println(product));
	}

}
