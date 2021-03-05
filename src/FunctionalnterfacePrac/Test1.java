package FunctionalnterfacePrac;

public class Test1 
{
public static void main(String[] args) 
{
	DemoInter d= (a,b)->System.out.println("method one excution="+(a+b));
	d.methodOne(10,5);
}
}
