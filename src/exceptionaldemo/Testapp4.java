package exceptionaldemo;

public class Testapp4 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(10/0);
		}finally 
		{
			System.out.println("Finally Block");
		}
		System.out.println("General");
	}
}
