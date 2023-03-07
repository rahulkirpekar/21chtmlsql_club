package lambdafunction;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Calc c = 	(no1, no2) -> (no1+no2);
					
		int ans = c.addFun(10,20);
		System.out.println("Addition : " + ans);
	}
}
