import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import StreamApi.Person;

public class A7 
{
	public static void main(String[] args) 
	{

		Person p= new Person(1,"nikhil", 27);
		Person p1= new Person(2, "Akshay", 26);
		Person p3= new Person(3,"vbv", 27);
		Person p4= new Person(4,"shubham", 25);

		ArrayList<Person> s= new ArrayList<Person>();
		s.add(p);
		s.add(p1);
		s.add(p3);
		s.add(p4);
		long person=  s.stream().filter(x -> x.getAge() < 27).count();
		System.out.println("count of person whose age  less than 27 is:-"+person);
	}
}
