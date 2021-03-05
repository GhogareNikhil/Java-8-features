package StreamApi;

import java.util.ArrayList;

public class OnlyNameSort 
{
	public static void main(String[] args) 
	{

		Person p= new Person(1,"nikhil", 27);
		Person p1= new Person(2, "Akshay", 26);
		Person p3= new Person(3,"vbv", 27);
		Person p4= new Person(4,"shubham", 27);

		ArrayList<Person> list= new ArrayList<Person>();
		list.add(p);
		list.add(p1);
		list.add(p3);
		list.add(p4);
		String   person=  list.stream().filter(x -> "nikhil".equals(x.getName()))
				.map(Person::getName).findAny().orElse(null);
        System.out.println(person);
	}

}
