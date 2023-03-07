package oops.absdemo;

public class BobBank extends AxisBank  implements RbiBank , A
{
	@Override
	public void test1() 
	{
		System.out.println("BobBank - test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("BobBank - test2()");
	}
	@Override
	public void test3() 
	{
		System.out.println("BobBank - test3()");
	}
}
