package threaddemo;

public class MyThread3 extends Thread
{
	@Override
	public void run() 
	{
		if (Thread.currentThread().isDaemon()) 
		{
			System.out.println("I am Daemon Thread");
		}else 
		{
			System.out.println("I am not Daemon Thread");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("start");

		MyThread3 t1 = new MyThread3();
		t1.setDaemon(true);
		t1.start();
		System.out.println("Exit");
	}
}
