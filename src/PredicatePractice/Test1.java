package PredicatePractice;

import java.util.function.Predicate;

public class Test1 
{
 public static void main(String[] args) {
	Predicate<String> p=s->(s.length()<5);
	System.out.println(p.test("nikhil"));
	System.out.println(p.test("anju"));
}
}
