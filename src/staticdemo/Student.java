package staticdemo;

import java.util.Scanner;

public class Student 
{
	int rno;// unique
	String name;// unique
	int std;// unique
	static String sname;// same---static

	public static void setSchoolName() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SchoolName : ");
		sname = sc.nextLine();
	}	
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
	void disp() 
	{
		System.out.println(rno + " " + name + " " + std + " " + sname);
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName();
		
		Student s[] = new Student[5];
		int i;

		for(i=0;i<5;i++) 
		{
			s[i] = new Student();
			s[i].scan();//s[2]--rno name std ------ > sname
		}
		for(i=0;i<5;i++) 
		{
			s[i].disp();
		}
	}
}
