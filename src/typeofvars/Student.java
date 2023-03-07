package typeofvars;

import java.util.Scanner;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std);
	}
	public static void main(String[] args) 
	{
		int no1=5,no2=5,ans;
				
		ans = no1+no2;
		
		// Perin---> 0 0 
		// Dhaivat---> 0 0 
		// Khush---> RunTime Error
		// Manav---> CompileTime Error
		
		 System.out.println("Addition : " + ans);
		
//		Student s = new Student();
//		s.scan();
//		s.disp();
		
		
		
		
	}
}
