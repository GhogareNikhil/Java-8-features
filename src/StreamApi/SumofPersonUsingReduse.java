package StreamApi;

import java.util.ArrayList;

public class SumofPersonUsingReduse 
{
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
		Integer person=  list.stream().map(age -> age.getAge()).reduce(0, (sum , age) -> sum+age);
		System.out.println("sum of person :-"+person);
		
		Integer person1 =list.stream().map(age -> age.getAge()).reduce(0, Integer :: sum);
		System.out.println("sum of person :-"+person1);
	}
}
