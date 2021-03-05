package DoubleEqualOperator;

public class Test1 
{
	public void m2(int i)
	{
		System.out.println("from method refernce:"+i);
	}
public static void main(String[] args)
{
	Intrf f=i->System.out.println("from lambda expression:"+i);
	f.m1(10);
	Test1 t= new Test1();
	Intrf i1=t::m2;
	i1.m1(20);
}

	

}
