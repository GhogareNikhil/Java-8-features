package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSrotedDemo {
public static void main(String[] args) {
	Map<String,Integer> map= new HashMap<>();
	//map.put("five", 50);
	map.put("Ten", 100);
	map.put("Six", 60);
	map.put("Four", 40);
	map.put("Seven", 70);
	
	Map<Employee, Integer> map1=new HashMap<>();
	map1.put(new Employee(1,"Nikhil"),01);
	map.put("Six", 60);
	map.put("Four", 40);
	map.put("Seven", 70);
	
	
	//Traditional Approach
	  /*List<Entry<String, Integer>> entries= new ArrayList<>(map.entrySet());
	  Collections.sort(entries,(o1, o2) -> o1.getKey().compareTo(o2.getKey()));
	  for(Entry<String, Integer> entry:entries) {
	  System.out.println(entry.getKey()+" "+entry.getValue()); 
	  }*/
	 
	//by Using Stream
	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	
	//By using Object as key
}
	
	
}
