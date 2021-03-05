package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNameSort 
{
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("nikhil");
		list.add("Aksashhh");
		list.add("nikesh");
		list.add("Akshay");
       List<String> lists=list.stream().filter(name-> name.startsWith("A")).collect(Collectors.toList());
        
        System.out.println(lists);
        lists.forEach(System.out::println);

	}
	
}
