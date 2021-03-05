package PredicatePractice;

import java.util.function.Predicate;

public class Test2 
{
	public static void main(String[] args)
	{
	int[] x= {0,5,6,2,20,55,30};
	Predicate<Integer> p1=i->i>10;
	Predicate<Integer> p2=i->i%10==0;
		/*j*/
	
		/*
		 * System.out.println("The number are even:"); m1(p2.x);
		 */
	
	System.out.println("The number are not  gretter than 10:");
	m1(p1.negate(),x);
	
	System.out.println("The number is gretter than 10 And even are:");
	m1(p1.and(p2),x);
	
	System.out.println("The number is gretter than 10 Or even are:");
	m1(p1.or(p2),x);
	
}
	public static void m1(Predicate<Integer>p,int[ ]x)
	{
		for(int x1:x)
		{
			if(p.test(x1))
				System.out.println(x1);
		}
	}

}
