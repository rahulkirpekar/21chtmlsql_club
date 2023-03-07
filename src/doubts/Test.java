package doubts;

//Java program to demonstrate that enums can have
//constructor and concrete methods.

//An enum (Note enum keyword inplace of class keyword)

public class Test 
{
	// Driver method
	public static void main(String[] args)
	{
		Color c1 = Color.RED;

		System.out.println(c1);
		
		c1.colorInfo();
	}
}

