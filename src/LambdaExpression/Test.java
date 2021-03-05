package LambdaExpression;

public class Test 
{
	int x=777;
	public void m2()
	{
		int y=20;
		A a=()->
		{
			System.out.println(x);
			System.out.println(y);
			int x=888;
            //int y=999;
		};
		a.m1();
		//y=777;
	}
	public static void main(String[] args)
	{
		Test t= new Test();
		t.m2();
	}

}
