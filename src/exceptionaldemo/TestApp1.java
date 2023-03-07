package exceptionaldemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		int no1=10,no2=2,ans=0;
		
		try 
		{
			ans = no1/no2;

			try 
			{
				String name = null;
				System.out.println(name.length());
				
			} catch (ArithmeticException e) 
			{
				e.printStackTrace();
			}
			

			try 
			{
				int a[] = new int[5];
				a[5] = 100;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}catch (Exception e) 
		{
			System.out.println("Exception Handled by Catch Block");
			e.printStackTrace();
		}
		
		System.out.println("Division : " + ans);
		System.out.println("General Code");
	}
}
