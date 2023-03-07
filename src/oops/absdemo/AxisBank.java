package oops.absdemo;

public class AxisBank implements RbiBank 
{
	@Override
	public void test1() 
	{
		System.out.println("AxisBank - test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("AxisBank - test2()");
	}
	public void test3() 
	{
		System.out.println("AxisBank - test3()");		
	}
}