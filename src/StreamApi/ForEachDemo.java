package StreamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Nikhil");
		list.add("Akash");
		list.add("Vaibhav");
		
		list.forEach(obj->System.out.println(obj));
		
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "abc");
		map.put(2, "jkd");
		map.put(3, "daw");
		
		map.forEach((key,val)->System.out.println(key+": "+val));
		map.entrySet().forEach((obj)->System.out.println(obj));
	}
}
