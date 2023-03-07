package oops.absdemo;

public interface RbiBank 
{
	abstract void test1();// public 
	public void test2(); // abstract 
	void test3(); // public abstract 
	public static void test4() 
	{
		System.out.println("RbiBank - static ---test4()");
	} 
	public default void test5() 
	{
		test6();
		System.out.println("RbiBank - default ---test4()");
	} 
	private void test6() 
	{
		System.out.println("RbiBank - private ---test6()");
	} 
}
