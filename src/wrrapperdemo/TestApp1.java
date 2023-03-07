package wrrapperdemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		
		int no1 = Integer.parseInt(args[0]);
		
		int no;
		no = 100;

		// ---  AutoBoxing Rule
		Integer value = no;// --- Integer.valueOf(no)
		
		System.out.println("No : " + no);
		System.out.println("Value : " + value.toString());
		
		
		// UnBoxing
		no = value;// value.intValue()
		
	}
}
