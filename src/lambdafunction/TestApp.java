package lambdafunction;

public class TestApp implements Calc
{
	@Override
	public int addFun(int no1, int no2) 
	{
		return (no1+no2);
	}
	
	public static void main(String[] args) 
	{
		TestApp obj = new  TestApp();
		
		int ans = obj.addFun(10, 20);
				
		System.out.println("Addition : " + ans);
		
	} 
}
