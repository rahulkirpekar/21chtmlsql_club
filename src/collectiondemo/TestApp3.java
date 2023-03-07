package collectiondemo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<Student>list = new ArrayList<Student>();
		int choice =0;
		Student s = null;
		
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Below choice : ");
			System.out.println("1) Insert Student");
			System.out.println("2) Update Student By id");
			System.out.println("3) Delete Student By id");
			System.out.println("4) Searching Student By id");
			System.out.println("5) Display all records");
			System.out.println("6) For Exit");
			choice = sc.nextInt();
			switch(choice) 
			{
				case 1:	s = new Student();
						s.scan();
						list.add(s);
						System.out.println("Student records successfully inserted");
						break;
				case 2:	System.out.println("Enter Rno which you want to update : ");
						int updateRno = sc.nextInt();
						int i=0;
						boolean flag = false;
						for(; i<list.size(); i++) 
						{
							s = list.get(i);
							if (s.getRno() == updateRno) 
							{
								flag= true;
								break;
							}
						}
						if(flag) 
						{
							s.update(); 
							list.set(i, s);
							System.out.println("Student records successfully updated");
						}else 
						{
							System.out.println("Student given updatedrno is not match with any Student reocrrds");
						}
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
						for( i=0;i<list.size();i++) 
						{
							s  = list.get(i);
							s.disp();	
						}
					break;
				case 6:
						System.exit(0);
					break;
			}
			
		}while(choice!=6);
		
		
		
		
	}
}
