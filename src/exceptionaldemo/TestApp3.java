package exceptionaldemo;

import java.io.IOException;

class A
{
	public void test() throws NullPointerException , IOException
	{

	}
}
class B extends A
{
	@Override
	public void test() throws  ArithmeticException
	{
		
	}
}

public class TestApp3 
{
	public static void main(String[] args) 
	{
		
	}
}
