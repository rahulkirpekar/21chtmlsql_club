package innerdemo;

public class ChildB 
{
	public static void main(String[] args) 
	{
		TestA obj1 = new TestA() 
		{
			public void test() 
			{
				System.out.println("TestA - test()----"+this);
			}
		}; 
		obj1.test();
		TestA obj2 = new TestA() 
		{
			public void test() 
			{
				System.out.println("TestA - test()----"+this);
			}
		}; 
		obj2.test();
	}
}
