package oops.absdemo;

public class TestApp1 
{
	public static void main(String[] args)
	{
		RbiBank bank = new AxisBank();
		bank.test1();
		bank.test2();
		bank.test3();
		RbiBank.test4();
		
		bank = new BobBank();
		bank.test1();
		bank.test2();
		bank.test3();
		RbiBank.test4();
		
		bank = new SbiAhmBank();
		bank.test1();
		bank.test2();
		bank.test3();
		RbiBank.test4();
		bank.test5();
	}
}
