package threaddemo;

public class Table 
{
	public void printTable(int no) 
	{
		synchronized (this) 
		{
			for (int i = 1; i <=10; i++) 
			{
				System.out.println( Thread.currentThread().getName() + "----"+  no + " * " + i + " = " + (no*i) );
			}
		}
	}
}
