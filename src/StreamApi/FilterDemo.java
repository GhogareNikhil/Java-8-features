package StreamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {
public static void main(String[] args) {
	List<String> list= new ArrayList<>();
	list.add("Nikhil");
	list.add("Akash");
	list.add("Vaibhav");
	
	list.stream().filter(t->t.startsWith("A")).forEach(t-> System.out.println(t));
	
	Map<Integer, String> map= new HashMap<>();
	map.put(1, "abc");
	map.put(2, "jkd");
	map.put(3, "daw");
	
	map.entrySet().stream().filter(t-> (t.getKey()%2==0)).forEach(obj->System.out.println(obj));
	map.entrySet().stream().filter(val->(val.getValue().startsWith("d"))).forEach(obj-> System.out.println(obj));
 }
}
